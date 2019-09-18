package com.walmart.service;

import com.walmart.pojo.Memberattribute;

import java.util.List;

public interface RegisterService {
    List<Memberattribute> findregister();

    void saveregister(Memberattribute memberattribute);

    void delregister(Long id);

    List<Memberattribute> findregisterid(Long id);

    void updateregister(Memberattribute memberattribute);

    void delgisterall(Long[] id);
}
