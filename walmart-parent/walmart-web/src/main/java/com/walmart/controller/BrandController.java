package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Brand;
import com.walmart.pojo.Businessattribute;
import com.walmart.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(timeout = 60000)
    private BrandService brandService;

    @RequestMapping("/searchBrand")
    public PageResult searchBrand(Brand brand, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return brandService.findPageBrand(brand,rows,page);
    }
    @RequestMapping("/addBrand")
    public void addBrand(Brand brand){
        brandService.addBrand(brand);
    }

}
