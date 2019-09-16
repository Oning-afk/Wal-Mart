package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Store;

public interface StoreService {
    PageResult findStore(int pageSize, int pageNum, Store store, int hasExpired);

    void addStore(Store store);

    Store findStoreById(Long id);

    void editStore(Store store);
}
