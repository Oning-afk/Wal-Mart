package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ProductCategoryBeanMapper;
import com.walmart.mapper.SpecificationMapper;
import com.walmart.pojo.ProductCategoryBean;
import com.walmart.pojo.Specification;
import com.walmart.pojo.SpecificationAndProductCategoryBeanMapper;
import com.walmart.pojo.SpecificationExample;
import com.walmart.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecificationMapper specificationMapper;

    @Autowired
    private ProductCategoryBeanMapper productCategoryBeanMapper;


    @Override
    public PageResult findSpecification(Specification specification, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        SpecificationExample specificationExample = new SpecificationExample();
        SpecificationExample.Criteria criteria = specificationExample.createCriteria();
        if (specification != null){
            if (specification.getName() != null && specification.getName() != ""){
                criteria.andNameLike("%"+specification.getName()+"%");
            }
        }
        Page<Specification> specifications = (Page<Specification>) specificationMapper.selectByExample(specificationExample);
        Page<SpecificationAndProductCategoryBeanMapper> specificationAndProductCategoryBeanMappers = new Page<>();
        specificationAndProductCategoryBeanMappers.setTotal(specifications.getTotal());
        for (Specification specification1: specifications){
            SpecificationAndProductCategoryBeanMapper specificationAndProductCategoryBeanMapper = new SpecificationAndProductCategoryBeanMapper();
            specificationAndProductCategoryBeanMapper.setSpecification(specification1);
            ProductCategoryBean productCategoryBean = productCategoryBeanMapper.selectByPrimaryKey(specification1.getProductcategoryId());
            specificationAndProductCategoryBeanMapper.setProductCategoryBean(productCategoryBean);
            specificationAndProductCategoryBeanMappers.add(specificationAndProductCategoryBeanMapper);
        }
        return new PageResult(specificationAndProductCategoryBeanMappers.getTotal(),specificationAndProductCategoryBeanMappers.getResult());
    }

    @Override
    public boolean delSpecification(String[] ids) {
        int i =0;
        for (String id: ids){
            i = specificationMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }
}
