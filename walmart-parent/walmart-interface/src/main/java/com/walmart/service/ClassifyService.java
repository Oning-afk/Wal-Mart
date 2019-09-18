package com.walmart.service;

import com.walmart.pojo.Storecategory;

import java.util.List;

public interface ClassifyService {
    List<Storecategory> findclassify();

    void saveclassify(Storecategory storecategory);

    void dleclassify(Long id);

    List<Storecategory> selectclassify(Integer id);
}
