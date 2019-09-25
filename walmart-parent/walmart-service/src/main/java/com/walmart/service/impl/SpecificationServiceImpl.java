package com.walmart.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
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

import java.util.ArrayList;
import java.util.Date;
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
        Page<Specification> specifications = (Page<Specification>) specificationMapper.selectByExampleWithBLOBs(specificationExample);
        Page<SpecificationAndProductCategoryBeanMapper> specificationAndProductCategoryBeanMappers = new Page<>();
        specificationAndProductCategoryBeanMappers.setTotal(specifications.getTotal());
        for (Specification specification1: specifications){
            String options = specification1.getOptions();
            String option = "";
            if(options != null){
                List<String> parse = (List<String>) JSONUtils.parse(options);
                for (String s : parse) {
                    option += s +" ";
                }
            }
            specification1.setOptions(option);
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

    @Override
    public void addSpecification(Specification specification) {
        specification.setCreateddate(new Date());
        specification.setLastmodifieddate(new Date());
        specification.setVersion((long) 0);
        specification.setProductcategoryId((long) 41);
        specificationMapper.insert(specification);
    }

    @Override
    public Specification seachSpecifion(Long id) {

        return specificationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Specification> specificationQuery() {
        return specificationMapper.selectByExample(null);
    }

    @Override
    public List<SpecificationAndProductCategoryBeanMapper> findStockAll() {
        List<Specification> specifications = specificationMapper.selectByExample(null);
        int count = specificationMapper.countByExample(null);
        List<SpecificationAndProductCategoryBeanMapper> specificationAndProductCategoryBeanMappers = new ArrayList<>();
        for (Specification specification : specifications){
            SpecificationAndProductCategoryBeanMapper specificationAndProductCategoryBeanMapper = new SpecificationAndProductCategoryBeanMapper();
            specificationAndProductCategoryBeanMapper.setSpecification(specification);
            ProductCategoryBean productCategoryBean = productCategoryBeanMapper.selectByPrimaryKey(specification.getProductcategoryId());
            specificationAndProductCategoryBeanMapper.setProductCategoryBean(productCategoryBean);
            specificationAndProductCategoryBeanMappers.add(specificationAndProductCategoryBeanMapper);
        }
        return specificationAndProductCategoryBeanMappers;
    }



}
