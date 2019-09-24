package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Attribute;
import com.walmart.service.AttributeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attribute")
public class AttributeController {

    @Reference
    private AttributeService attributeService;

    @RequestMapping("/findAttributeService")
    public PageResult findAttributeService(Attribute attribute, @RequestParam(defaultValue = "1")Integer pageSize, @RequestParam(defaultValue = "124")Integer pageNum){

        return attributeService.findAttributeService(attribute,pageSize,pageNum);
    }

    @RequestMapping("/delAttribute")
    public boolean delAttribute(String [] ids){

            return attributeService.delAttribute(ids);
    }
}
