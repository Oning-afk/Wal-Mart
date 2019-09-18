package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.StorecategoryMapper;
import com.walmart.pojo.Storecategory;
import com.walmart.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private StorecategoryMapper storecategoryMapper;
    @Override
    public List<Storecategory> findclassify() {
        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void saveclassify(Storecategory storecategory) {
        storecategoryMapper.insert(storecategory);
    }

    @Override
    public void dleclassify(Long id) {
        storecategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Storecategory> selectclassify(Integer id) {

        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void delclassifyall(Long[] id) {
        for (long id4:id) {
            storecategoryMapper.deleteByPrimaryKey(id4);
        }
    }

}
