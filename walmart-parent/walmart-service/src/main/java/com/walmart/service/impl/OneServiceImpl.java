package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.StorecategoryMapper;
import com.walmart.pojo.Storecategory;
import com.walmart.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OneServiceImpl implements OneService {
    @Autowired
    private StorecategoryMapper storecategoryMapper;

    @Override
    public List<Storecategory> find() {

        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void delone(Long id) {
        storecategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveone(Storecategory storecategory) {

        storecategoryMapper.insert(storecategory);
    }

    @Override
    public List<Storecategory> findone(Long id) {

        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void updateone(Storecategory storecategory) {
        storecategoryMapper.updateByPrimaryKey(storecategory);
    }

}
