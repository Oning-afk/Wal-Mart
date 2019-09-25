package com.walmart.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.PointlogMapper;
import com.walmart.pojo.Pointlog;
import com.walmart.pojo.PointlogExample;
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

    @Override
    public PageResult findAll(Pointlog pointlog, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        PointlogExample example=new PointlogExample();
        PointlogExample.Criteria criteria=example.createCriteria();
        Page<Pointlog> pagew= (Page<Pointlog>) pointlogMapper.selectByExample(null);
        long totalpage=(int) Math.ceil(pagew.getTotal()/pagew.getPageSize());
        return new PageResult(pagew.getTotal(),pagew.getResult(),page,rows,totalpage);
    }

    @Override
    public List<Pointlog> queryList() {

        return pointlogMapper.selectByExample(null);
    }
}
