package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Article;

public interface ArticleService {
    public PageResult search(Article article, int pageSize, int pageNum);

    public void add(Article article);

    public void delete(Long[] ids);

    public Article findOne(Long id);

    public void updateproducttag(Article article);
}
