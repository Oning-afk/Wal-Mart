package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: Wal-Mart
 * @description: 商品-controller
 * @author: 张晋浩
 * @create: 2019-09-11 09:18
 **/
@RequestMapping("product")
@Controller
public class ProductController {

    @Reference
    private ProductService productService;

    /**
     * 商品-商品管理列表查询
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public PageResult findProductList(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "5") Integer rows){

        return productService.findProductList(rows,page);
    }

    /**
     * 商品-商品管理上架
     * @param id
     */
    @RequestMapping("updateToUp")
    @ResponseBody
    public boolean updateToUp(Long id){
        return productService.updateToUp(id);
    }

    /**
     * 商品-商品管理下架
     * @param id
     */
    @RequestMapping("updateToDown")
    @ResponseBody
    public boolean updateToDown(Long id){
        return productService.updateToDown(id);
    }
}
