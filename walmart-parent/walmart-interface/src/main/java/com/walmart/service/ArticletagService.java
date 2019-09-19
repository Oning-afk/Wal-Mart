package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Articletag;

public interface ArticletagService {
    public PageResult search(Articletag articletag, int pageSize, int pageNum);

    public void add(Articletag articletag);

    public void delete(Long[] ids);

    public Articletag findOne(Long id);

    public void updateproducttag(Articletag articletag);
}
