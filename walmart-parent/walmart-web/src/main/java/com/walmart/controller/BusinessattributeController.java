package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Businessattribute;
import com.walmart.service.BusinessattributeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/businessattribute")
public class BusinessattributeController {
    @Reference(timeout = 60000)
    private BusinessattributeService businessattributeService;

    @RequestMapping("/searchBusinessattribute")
    public PageResult searchBusinessattribute(Businessattribute businessattribute, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return businessattributeService.findPageBusinessattribute(businessattribute,rows,page);
    }
    @RequestMapping("/deleteBusinessattribute")
    public Result deleteBusinessattribute(Long[] ids){
        try {
            businessattributeService.deleteBusinessattribute(ids);
            return new Result(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  new Result(false,"删除失败！");
    }

}
