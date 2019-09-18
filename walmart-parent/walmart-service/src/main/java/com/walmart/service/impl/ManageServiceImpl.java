package com.walmart.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.PointlogMapper;
import com.walmart.pojo.Pointlog;
import com.walmart.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {
@Autowired
private PointlogMapper pointlogMapper;

    @Override
    public List<Pointlog> findmanage() {

        return pointlogMapper.selectByExample(null);
    }

    @Override
    public void savemanage(Pointlog pointlog) {
        pointlogMapper.insert(pointlog);
    }

    @Override
    public void delmanager(Long id) {
        pointlogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Pointlog> findmanageid(Long id) {
        return pointlogMapper.selectByExample(null);
    }

    @Override
    public void updatemanage(Pointlog pointlog) {
        pointlogMapper.updateByPrimaryKeySelective(pointlog);
    }

    @Override
    public void delmanageall(Long[] id) {
        for (long id2 : id) {
            pointlogMapper.deleteByPrimaryKey(id2);
        }
    }
}
