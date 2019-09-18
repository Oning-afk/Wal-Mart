package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.StorerankMapper;
import com.walmart.pojo.Storerank;
import com.walmart.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private StorerankMapper storerankMapper;
    @Override
    public List<Storerank> findgrade() {
        return storerankMapper.selectByExample(null);
    }

    @Override
    public void savegrade(Storerank storerank) {
        storerankMapper.insert(storerank);
    }

    @Override
    public void delgrade(Long id) {
        storerankMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Storerank> selectgrade(Long id) {
        return storerankMapper.selectByExample(null);
    }

    @Override
    public void delGradeall(Long[] id) {
        for ( long id5:id) {
            storerankMapper.deleteByPrimaryKey(id5);
        }
    }
}
