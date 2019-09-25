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

import java.util.Date;
import java.util.List;

@Service(timeout = 60000)
public class BusinessattributeServiceImpl implements BusinessattributeService {
    @Autowired
    private BusinessattributeMapper businessattributeMapper;
    @Override
    public PageResult findPageBusinessattribute(Businessattribute businessattribute, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        BusinessattributeExample businessattributeExample = new BusinessattributeExample();
        BusinessattributeExample.Criteria criteria = businessattributeExample.createCriteria();
        if (businessattribute.getName() !=null){
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

    @Override
    public boolean updateBusinessattribute(Businessattribute businessattribute) {
        return businessattributeMapper.updateByPrimaryKeySelective(businessattribute)>0;
    }

    @Override
    public Businessattribute searchBusinessattributeById(Long id) {
        return businessattributeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addBusinessattribute(Businessattribute businessattribute) {
        businessattribute.setCreateddate(new Date());
        businessattribute.setLastmodifieddate(new Date());
        businessattribute.setVersion((long) 0);
        businessattribute.setPropertyindex(0);
        businessattributeMapper.insert(businessattribute);
    }

    @Override
    public List<Businessattribute> findPage() {
        return businessattributeMapper.selectByExample(null);
    }
}
