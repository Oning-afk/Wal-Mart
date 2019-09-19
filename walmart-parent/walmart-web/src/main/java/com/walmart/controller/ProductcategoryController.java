package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.Result;
import com.walmart.pojo.Productcategory;
import com.walmart.service.ProductcategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductcategoryController {
    @Reference
    private ProductcategoryService productcategoryService;

    /**
     * 查询-商品分类
     * @return
     */
    @RequestMapping("query")
    public List<Productcategory> Productcategoryquery(){
        return productcategoryService.Productcategoryquery();
    }

    /**
     * 新增-商品分类
     * @param productcategory
     * @return
     */
    @RequestMapping("add")
    public Result add(Productcategory productcategory){

        try {
            productcategoryService.add(productcategory);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
     * 删除-商品分类
     * @param id
     */
    @RequestMapping("delete")
    public void delete(long id){
        productcategoryService.delete(id);
    }

    /**
     * 回显-商品分类
     * @param id
     * @return
     */
    @RequestMapping("findOne")
    public Productcategory findOne(Long id){
        return productcategoryService.findOne(id);
    }

    /**
     * 修改-商品分类
     * @param productcategory
     */
    @RequestMapping("update")
    public void update(Productcategory productcategory){
        productcategoryService.update(productcategory);
    }


    }
