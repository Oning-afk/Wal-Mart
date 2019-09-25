package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Article;
import com.walmart.pojogroup.ArticleandArticlecategory;

import java.util.List;

public interface ArticleService {
    public PageResult search(Article article, int pageSize, int pageNum);

    public void add(Article article);

    public void delete(Long[] ids);

    public Article findOne(Long id);

    public void updateproducttag(Article article);

    public List<ArticleandArticlecategory> searchquert();
}
