package com.walmart.service;

import com.walmart.pojo.Storerank;

import java.util.List;

public interface GradeService {
    List<Storerank> findgrade(Boolean isallowregister);

    void savegrade(Storerank storerank);

    void delgrade(Long id);

    List<Storerank> selectgrade(Long id);

    List<Storerank> findGradeAll();
}
