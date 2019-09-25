package com.walmart.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ArticleMapper;
import com.walmart.mapper.ArticlecategoryMapper;
import com.walmart.pojo.Article;
import com.walmart.pojo.ArticleExample;
import com.walmart.pojo.Articlecategory;
import com.walmart.pojogroup.ArticleandArticlecategory;
import com.walmart.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticlecategoryMapper articlecategoryMapper;
    @Override
    public PageResult search(Article article, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ArticleExample example = new ArticleExample();
        ArticleExample.Criteria criteria = example.createCriteria();
        if(article != null){
            if(article.getTitle() !=null && article.getTitle().length() >=0){
                criteria.andTitleLike("%"+article.getTitle()+"%");
            }
        }
        //查到的数据
        Page<Article> Arti = (Page<Article>) articleMapper.selectByExample(example);
        //创建两表结合bean
        Page<ArticleandArticlecategory> atticles = new Page<ArticleandArticlecategory>();
        //先将主表添加到两表的结合中
        atticles.setTotal(Arti.getTotal());
        //通过循环查找关联的数据去查第二张表的数据并赋值
        for (Article Arti2 : Arti){
            ArticleandArticlecategory ancyo = new ArticleandArticlecategory();
            ancyo.setArticle(Arti2);
            Articlecategory procdu = articlecategoryMapper.selectByPrimaryKey(Arti2.getArticlecategoryId());
            ancyo.setArticlecategory(procdu);
            atticles.add(ancyo);
        }
        //总页数
        long totalpage = (int) Math.ceil(Arti.getTotal()/Arti.getPageSize());
        return new PageResult(atticles.getTotal(),atticles.getResult(),pageNum,pageSize,totalpage);
    }

    @Override
    public void add(Article article) {
        article.setCreateddate(new Date());
        article.setLastmodifieddate(new Date());
        article.setVersion((long) 0);
        article.setHits((long) 0);
        articleMapper.insert(article);
    }

    @Override
    public void delete(Long[] ids) {
        for (long id : ids){
            articleMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Article findOne(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateproducttag(Article article) {
        article.setCreateddate(new Date());
        article.setLastmodifieddate(new Date());
        article.setVersion((long) 0);
        article.setHits((long) 0);
        articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public List<ArticleandArticlecategory> searchquert() {
        List<Article> articles = articleMapper.selectByExample(null);
        int count = articleMapper.countByExample(null);
        List<ArticleandArticlecategory> list = new ArrayList<>();
        for (Article Arti2 : articles){
            ArticleandArticlecategory ancyo = new ArticleandArticlecategory();
            ancyo.setArticle(Arti2);
            Articlecategory procdu = articlecategoryMapper.selectByPrimaryKey(Arti2.getArticlecategoryId());
            ancyo.setArticlecategory(procdu);
            list.add(ancyo);
        }
        return list;
    }
}
