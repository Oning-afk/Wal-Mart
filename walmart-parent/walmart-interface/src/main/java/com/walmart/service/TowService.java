package com.walmart.service;

import com.walmart.pojo.Storecategory;

import java.util.List;

public interface TowService {
    List<Storecategory> find();

    void deltow(Long id);

    void savetow(Storecategory storecategory);

    List<Storecategory> findtow(Long id);

    void updatetow(Storecategory storecategory);
}
