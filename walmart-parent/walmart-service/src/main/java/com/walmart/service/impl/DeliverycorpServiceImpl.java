package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.DeliverycorpMapper;
import com.walmart.pojo.Deliverycorp;
import com.walmart.pojo.DeliverycorpExample;
import com.walmart.service.DeliverycorpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class DeliverycorpServiceImpl implements DeliverycorpService {

    @Autowired
    private DeliverycorpMapper deliverycorpMapper;

    @Override
    public PageResult findDeliverycorp(Deliverycorp deliverycorp, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        DeliverycorpExample deliverycorpExample = new DeliverycorpExample();
        DeliverycorpExample.Criteria criteria = deliverycorpExample.createCriteria();
        if (deliverycorp != null){
            if (deliverycorp.getName() != null && deliverycorp.getName().length()>0){
                criteria.andNameLike("%"+deliverycorp.getName()+"%");
            }
        }
        Page<Deliverycorp> deliverycorps = (Page<Deliverycorp>) deliverycorpMapper.selectByExample(deliverycorpExample);
        return new PageResult(deliverycorps.getTotal(),deliverycorps.getResult());
    }

    @Override
    public boolean delDeliverycorp(String[] ids) {

        int i =0;
        for (String id: ids){
            i = deliverycorpMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }
    }

