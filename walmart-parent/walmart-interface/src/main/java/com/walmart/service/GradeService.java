package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Storerank;

import java.util.List;

public interface GradeService {
    List<Storerank> findgrade();

    void savegrade(Storerank storerank);

    void delgrade(Long id);

    List<Storerank> selectgrade(Long id);

    void delGradeall(Long[] id);

    PageResult findAll(Storerank storerank, Integer page, Integer rows);

    List<Storerank> queryList();

    void updateGrade(Storerank storerank);
}
