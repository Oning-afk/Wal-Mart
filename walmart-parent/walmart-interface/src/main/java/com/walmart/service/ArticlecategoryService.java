package com.walmart.service;

import com.walmart.pojo.Articlecategory;

import java.util.List;

public interface ArticlecategoryService {
    public List<Articlecategory> articlecategoryquery();

    public void add(Articlecategory articlecategory);

    public void delete(Long id);

    public Articlecategory findOne(Long id);

    public void update(Articlecategory articlecategory);
}
