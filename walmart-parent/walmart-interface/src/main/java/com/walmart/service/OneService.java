package com.walmart.service;


import com.walmart.pojo.Storecategory;

import java.util.List;

public interface OneService {
    List<Storecategory> find();

    void delone(Long id);

    void saveone(Storecategory storecategory);

    List<Storecategory> findone(Long id);

    void updateone(Storecategory storecategory);
}
