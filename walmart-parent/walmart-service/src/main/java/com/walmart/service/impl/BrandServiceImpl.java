package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.BrandMapper;
import com.walmart.pojo.Brand;
import com.walmart.pojo.BrandExample;
import com.walmart.pojo.Memberrank;
import com.walmart.pojo.MemberrankExample;
import com.walmart.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public PageResult findPageBrand(Brand brand, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        BrandExample brandExample = new BrandExample();
        BrandExample.Criteria criteria = brandExample.createCriteria();
        if (brand !=null){
            if (brand.getName() !=null && brand.getName().length() >0){
                criteria.andNameLike( "%" + brand.getName() +"%");
            }
        }
        Page<Brand> page = (Page<Brand>) brandMapper.selectByExample(brandExample);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addBrand(Brand brand) {
        brandMapper.insert(brand);
    }

    @Override
    public boolean deleteBrand(String[] ids) {
        int i =0;
        for (String id: ids){
            i = brandMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }
}
