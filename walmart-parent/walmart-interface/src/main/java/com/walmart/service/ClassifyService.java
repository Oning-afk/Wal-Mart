package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.Storerank;

import java.util.List;

public interface ClassifyService {
    List<Storecategory> findclassify();

    void saveclassify(Storecategory storecategory);

    void dleclassify(Long id);

    Storecategory selectclassify(Long id);

    void delclassifyall(Long[] id);

    PageResult findAll(Storecategory storecategory, Integer page, Integer rows);

    List<Storecategory> queryList();


    void updateclassify(Storecategory storecategory);

    PageResult findPageBrand(Storecategory storecategory, int pageSize, int pageNum);
}
