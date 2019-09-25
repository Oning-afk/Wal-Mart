package com.walmart.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ParameterMapper;
import com.walmart.mapper.ProductcategoryMapper;
import com.walmart.pojo.Parameter;
import com.walmart.pojo.ParameterExample;
import com.walmart.pojo.Productcategory;
import com.walmart.pojogroup.Parameterandproductcat;
import com.walmart.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ParameterServiceImpl implements ParameterService {
    @Autowired
    private ParameterMapper parameterMapper;

    @Autowired
    private ProductcategoryMapper productcategoryMapper;

    @Override
    public PageResult search(Parameter parameter, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        ParameterExample example = new ParameterExample();
        ParameterExample.Criteria criteria = example.createCriteria();
        if(parameter != null){
            if(parameter.getParametergroup() != null && parameter.getParametergroup().length() >=0){
                criteria.andParametergroupLike("%"+parameter.getParametergroup()+"%");
            }
        }
        //查到的数据
        Page<Parameter> param = (Page<Parameter>) parameterMapper.selectByExampleWithBLOBs(example);
        //创建两表结合bean
        Page<Parameterandproductcat> prdoct = new Page<Parameterandproductcat>();
        //先将主表添加到两表的结合中
        prdoct.setTotal(param.getTotal());
        //通过循环查找关联的数据去查第二张表的数据并赋值
        for (Parameter pram : param){
            String names = pram.getNames();
            String named = "";
            if(names != null){
                List<String> parse = (List<String>) JSONUtils.parse(names);
                for (String s : parse) {
                    named += s +" ";
                }
            }
            pram.setNames(named);
            Parameterandproductcat pant = new Parameterandproductcat();
            pant.setParameter(pram);
            Productcategory procdu = productcategoryMapper.selectByPrimaryKey(pram.getProductcategoryId());
            pant.setProductcategory(procdu);
            prdoct.add(pant);
        }
        //总页数
        long totalPage = (int) Math.ceil(param.getTotal() / param.getPageSize());
        return  new PageResult(prdoct.getTotal(),prdoct.getResult(),pageNum,pageSize,totalPage);
    }

    @Override
    public List<Productcategory> Productcategoryquery(){

        return productcategoryMapper.selectByExample(null);
    }

    @Override
    public void add(Parameter parameter) {
        parameter.setCreateddate(new Date());
        parameter.setLastmodifieddate(new Date());
        parameter.setVersion((long) 0);
        parameterMapper.insert(parameter);
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids){
            parameterMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Parameter findOne(Long id) {

        return parameterMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateproducttag(Parameter parameter) {
        parameter.setCreateddate(new Date());
        parameter.setLastmodifieddate(new Date());
        parameter.setVersion((long) 0);
        parameterMapper.updateByPrimaryKey(parameter);
    }

    @Override
    public List<Parameterandproductcat> searchquert() {
        List<Parameter> parameters = parameterMapper.selectByExample(null);
        int count = parameterMapper.countByExample(null);
        List<Parameterandproductcat> list = new ArrayList<>();
        for (Parameter pram : parameters){
            String names = pram.getNames();
            String named = "";
            if(names != null){
                List<String> parse = (List<String>) JSONUtils.parse(names);
                for (String s : parse) {
                    named += s +" ";
                }
            }
            pram.setNames(named);
            Parameterandproductcat pant = new Parameterandproductcat();
            pant.setParameter(pram);
            Productcategory procdu = productcategoryMapper.selectByPrimaryKey(pram.getProductcategoryId());
            pant.setProductcategory(procdu);
            list.add(pant);
        }
        return list;
    }
}
