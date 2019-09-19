package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Parameter;
import com.walmart.pojo.Productcategory;
import com.walmart.pojo.Producttag;

import java.util.List;

public interface ParameterService {
    public PageResult search(Parameter parameter, int pageSize, int pageNum);

    public List<Productcategory> Productcategoryquery();

    public void add(Parameter parameter);

    public void delete(Long[] ids);

    public Parameter findOne(Long id);

    public void updateproducttag(Parameter parameter);
}
