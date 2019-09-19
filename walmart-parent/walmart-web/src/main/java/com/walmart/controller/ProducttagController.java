package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Parameter;
import com.walmart.pojo.Producttag;
import com.walmart.service.ProducttagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Producttag")
public class ProducttagController {
    @Reference
    private ProducttagService producttagService;

    /**
     * 分页查询-商品标签
     * @return
     */
    @RequestMapping("search")
    public PageResult search(Producttag producttag, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "3") int rows){
        return producttagService.search(producttag,rows,page);
    }

    /**
     * 新增-商品标签
     * @param producttag
     * @return
     */
    @RequestMapping("add")
    public Result add(Producttag producttag){

        try {
            producttagService.add(producttag);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
     * 批量删除-商品标签
     * @param ids
     */
    @RequestMapping("delete")
    public void delete(Long[] ids){
        producttagService.delete(ids);
    }

    /**
     * 回显-商品标签
     * @param id
     * @return
     */
    @RequestMapping("findOne")
    public Producttag findOne(Long id){
        return producttagService.findOne(id);
    }

    /**
     * 修改-商品标签
     * @param producttag
     */
    @RequestMapping("update")
    public void update(Producttag producttag){
        producttagService.updateproducttag(producttag);
    }


}
