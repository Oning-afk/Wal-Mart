package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Storeproducttag;

import java.util.List;

public interface SptagService {
    List<Storeproducttag> findsptag();

    void savesptag(Storeproducttag storeproducttag);

    void delsptagall(Long[] id);

    PageResult findAll(Storeproducttag storeproducttag, Integer page, Integer rows);
}
