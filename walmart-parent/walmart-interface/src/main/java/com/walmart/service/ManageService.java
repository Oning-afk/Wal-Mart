package com.walmart.service;


import com.walmart.entity.PageResult;
import com.walmart.pojo.Pointlog;

import java.util.List;

public interface ManageService {
    List<Pointlog> findmanage();

    void savemanage(Pointlog pointlog);

    void delmanager(Long id);

    List<Pointlog> findmanageid(Long id);

    void updatemanage(Pointlog pointlog);

    void delmanageall(Long[] id);

    PageResult findAll(Pointlog pointlog, Integer page, Integer rows);

    List<Pointlog> queryList();
}
