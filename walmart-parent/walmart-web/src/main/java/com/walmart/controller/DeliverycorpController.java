package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Deliverycorp;
import com.walmart.service.DeliverycorpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deliverycorp")
public class DeliverycorpController {

    @Reference
    private DeliverycorpService deliverycorpService;


    @RequestMapping("/findDeliverycorp")
    public PageResult findDeliverycorp(Deliverycorp deliverycorp, @RequestParam(defaultValue = "1")Integer pageSize,  @RequestParam(defaultValue = "124")Integer pageNum){
        return deliverycorpService.findDeliverycorp(deliverycorp,pageSize,pageNum);
    }

    @RequestMapping("/delDeliverycorp")
    public boolean delDeliverycorp(String [] ids){
        return deliverycorpService.delDeliverycorp(ids);
    }
}
