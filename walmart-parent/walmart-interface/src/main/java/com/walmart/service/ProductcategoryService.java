package com.walmart.service;

import com.walmart.pojo.Productcategory;

import java.util.List;

public interface ProductcategoryService {

    public List<Productcategory> Productcategoryquery();

    public void add(Productcategory productcategory);

    public void delete(Long id);

    public Productcategory findOne(Long id);

    public void update(Productcategory productcategory);
}
