package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.ArticlecategoryMapper;
import com.walmart.pojo.Articlecategory;
import com.walmart.service.ArticlecategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class ArticlecategoryServiceImpl implements ArticlecategoryService {
    @Autowired
    private ArticlecategoryMapper articlecategoryMapper;

    @Override
    public List<Articlecategory> articlecategoryquery() {

        return articlecategoryMapper.selectByExample(null);
    }

    @Override
    public void add(Articlecategory articlecategory) {
        articlecategory.setCreateddate(new Date());
        articlecategory.setLastmodifieddate(new Date());
        articlecategory.setVersion((long) 0);
        articlecategory.setGrade(0);
        articlecategory.setTreepath("、");
        articlecategoryMapper.insert(articlecategory);
    }

    @Override
    public void delete(Long id) {
        articlecategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Articlecategory findOne(Long id) {
        return articlecategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Articlecategory articlecategory) {
        articlecategory.setCreateddate(new Date());
        articlecategory.setLastmodifieddate(new Date());
        articlecategory.setVersion((long) 0);
        articlecategory.setGrade(0);
        articlecategory.setTreepath("、");
        articlecategoryMapper.updateByPrimaryKey(articlecategory);
    }

    @Override
    public List<Articlecategory> searchquert() {

        return articlecategoryMapper.selectByExample(null);
    }

}
