package com.walmart.controller;

import com.alibaba.druid.sql.PagerUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: Wal-Mart
 * @description: 商品-库存管理-控制层
 * @author: 张晋浩
 * @create: 2019-09-11 20:31
 **/
@RequestMapping("stock")
@Controller
public class StockController {

    @Reference
    private StockService stockService;


    @RequestMapping("findStockAll")
    @ResponseBody
    public PageResult findStockAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){
        return stockService.findStockAll(page,rows);
    }

}
