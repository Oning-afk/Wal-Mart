package com.walmart.service.impl;

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
        articleMapper.updateByPrimaryKey(article);
    }


}
