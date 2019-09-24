package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Storeproductcategory;
import com.walmart.service.SptegoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("sproductcategory")
public class SptegoryController {
@Reference
    private SptegoryService sptegoryService;
@RequestMapping("findsproductcategory")
    public List<Storeproductcategory> findsproductcategory(){
   return sptegoryService.findsproductcategory();
}
    @RequestMapping("savesproductcategory")
    public void savesproductcategory(Storeproductcategory storeproductcategory){
        storeproductcategory.setCreateddate(new Date());
        storeproductcategory.setGrade(1);
        storeproductcategory.setLastmodifieddate(new Date());
        storeproductcategory.setParentId((long)2);
        storeproductcategory.setStoreId((long)1);
        storeproductcategory.setVersion((long)0);
        storeproductcategory.setTreepath("分类");
         sptegoryService.savesproductcategory(storeproductcategory);
    }
    @RequestMapping("delsproductcategoryall")
    public void delsproductcategoryall(Long[] id){
         sptegoryService.delsproductcategoryall(id);
    }
    @RequestMapping("findAll")
    public PageResult findAll(Storeproductcategory storeproductcategory, @RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "5")Integer rows){


   return   sptegoryService.findAll(storeproductcategory,page,rows);
    }
}
