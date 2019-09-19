package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ArticletagMapper;
import com.walmart.pojo.Articletag;
import com.walmart.pojo.ArticletagExample;
import com.walmart.service.ArticletagService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Service
public class ArticletagServiceImpl implements ArticletagService {
    @Autowired
    private ArticletagMapper articletagMapper;

    @Override
    public PageResult search(Articletag articletag, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ArticletagExample example = new ArticletagExample();
        ArticletagExample.Criteria criteria = example.createCriteria();
        Page<Articletag> articletags = (Page<Articletag>) articletagMapper.selectByExample(example);
       long totalpage = (int) Math.ceil(articletags.getTotal()/pageSize) +1;
        return new PageResult(articletags.getTotal(),articletags.getResult(),pageNum,pageSize,totalpage);
    }

    @Override
    public void add(Articletag articletag) {
        articletag.setCreateddate(new Date());
        articletag.setLastmodifieddate(new Date());
        articletag.setVersion((long) 0);
        articletagMapper.insert(articletag);
    }

    @Override
    public void delete(Long[] ids) {
        for(long id : ids){

            articletagMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public Articletag findOne(Long id) {
        return articletagMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateproducttag(Articletag articletag) {
        articletag.setCreateddate(new Date());
        articletag.setLastmodifieddate(new Date());
        articletag.setVersion((long) 0);
        articletagMapper.updateByPrimaryKey(articletag);
    }
}
