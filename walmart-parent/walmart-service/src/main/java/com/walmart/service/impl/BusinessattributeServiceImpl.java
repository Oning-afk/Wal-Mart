package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.BusinessattributeMapper;
import com.walmart.pojo.Businessattribute;
import com.walmart.pojo.BusinessattributeExample;
import com.walmart.service.BusinessattributeService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(timeout = 60000)
public class BusinessattributeServiceImpl implements BusinessattributeService {
    @Autowired
    private BusinessattributeMapper businessattributeMapper;
    @Override
    public PageResult findPageBusinessattribute(Businessattribute businessattribute, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        BusinessattributeExample businessattributeExample = new BusinessattributeExample();
        BusinessattributeExample.Criteria criteria = businessattributeExample.createCriteria();
        if (businessattribute !=null){
            if (businessattribute.getName() !=null && businessattribute.getName().length() >0){
                criteria.andNameLike( "%" + businessattribute.getName() +"%");
            }
        }
        Page<Businessattribute> page = (Page<Businessattribute>) businessattributeMapper.selectByExample(businessattributeExample);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void deleteBusinessattribute(Long[] ids) {

        for (Long id : ids){
            businessattributeMapper.deleteByPrimaryKey(id);
        }
    }
}
