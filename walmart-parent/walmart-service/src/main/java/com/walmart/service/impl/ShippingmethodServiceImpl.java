package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ShippingmethodMapper;
import com.walmart.pojo.Shippingmethod;
import com.walmart.pojo.ShippingmethodExample;
import com.walmart.service.ShippingmethodService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ShippingmethodServiceImpl implements ShippingmethodService {
    @Autowired
    private ShippingmethodMapper shippingmethodMapper;
    @Override
    public PageResult findPageShippingmethod(Shippingmethod shippingmethod, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ShippingmethodExample shippingmethodExample = new ShippingmethodExample();
        ShippingmethodExample.Criteria criteria = shippingmethodExample.createCriteria();
        if (shippingmethod !=null){
            if (shippingmethod.getName() !=null && shippingmethod.getName().length() >0){
                criteria.andNameLike( "%" + shippingmethod.getName() +"%");
            }
        }
        Page<Shippingmethod> page = (Page<Shippingmethod>) shippingmethodMapper.selectByExample(shippingmethodExample);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public boolean deleteShippingmethod(String[] ids) {
        int i = 0;
        for (String id : ids) {
           i = shippingmethodMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }
}
