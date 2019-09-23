package com.walmart.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Product;
import com.walmart.pojo.ProductWithBLOBs;
import com.walmart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: walmart-parent
 * @description: 产品控制层
 * @author: 张晋浩
 * @create: 2019-09-23 19:33
 **/

@RequestMapping("productShop")
@Controller
public class ProductController {

    @Reference
    private ProductService productService;


    @ResponseBody
    @RequestMapping("queryHotPhone")
    public List<Product> queryHotPhone(){

        return productService.queryHotPhone();
    }

    @ResponseBody
    @RequestMapping("queryHotComputer")
    public List<Product> queryHotComputer(){

        return productService.queryHotComputer();
    }

    @ResponseBody
    @RequestMapping("queryHotTv")
    public List<Product> queryHotTv(){

        return productService.queryHotTv();
    }


    @ResponseBody
    @RequestMapping("queryProductById")
    public ProductWithBLOBs queryProductById(Long id){

        return productService.queryProductById(id);
    }
}
