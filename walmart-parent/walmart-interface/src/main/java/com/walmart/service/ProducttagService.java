package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Producttag;

public interface ProducttagService {

    public PageResult search(Producttag producttag, int pageSize, int pageNum);

    public void add(Producttag producttag);

    public void delete(Long[] ids);

    public Producttag findOne(Long id);

    public void updateproducttag(Producttag producttag);
}
