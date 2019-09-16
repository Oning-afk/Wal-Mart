package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.StorecategoryMapper;
import com.walmart.pojo.Storecategory;
import com.walmart.service.TowService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TowServiceImpl implements TowService {
    @Autowired
    private StorecategoryMapper storecategoryMapper;
    @Override
    public List<Storecategory> find() {

        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void deltow(Long id) {
        storecategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void savetow(Storecategory storecategory) {
        storecategoryMapper.insert(storecategory);
    }

    @Override
    public List<Storecategory> findtow(Long id) {
        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void updatetow(Storecategory storecategory) {
        storecategoryMapper.updateByPrimaryKeySelective(storecategory);
    }
}
