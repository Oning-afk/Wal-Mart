package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Store;
import com.walmart.service.StoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: Wal-Mart
 * @description:店铺管理模块
 * @author: 邓希凡
 * @create: 2019-09-10 20:52
 **/
@RestController
@RequestMapping("store")
public class StoreController {

    @Reference(timeout = 120000,retries = 0)
    private StoreService storeService;

    /** 
    * @Description: 查询店铺列表 
    * @Param: 每页条数pageSize,第几页pageNum,条件查询Store
    * @return: 列表数据
    * @Author: 邓希凡 
    * @Date: 2019/9/11 
    */ 
    @RequestMapping("findStore")
    public PageResult findStore(@RequestParam(defaultValue = "20") int pageSize,@RequestParam(defaultValue = "1") int pageNum, Store store,int hasExpired){
        return storeService.findStore(pageSize,pageNum,store,hasExpired);
    }

    /**
    * @Description: 增加店铺
    * @Param: 店铺实体Bean
    * @return: 是否成功
    * @Author: 邓希凡
    * @Date: 2019/9/11
    */
    @RequestMapping("addStore")
    public Result addStore(Store store){
        try {
            storeService.addStore(store);
            return new Result(true,"新增成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败!");
    }

    /**
    * @Description: 修改回显方法
    * @Param: 店铺id
    * @return:店铺实体bean
    * @Author: 邓希凡
    * @Date: 2019/9/11
    */
    @RequestMapping("findStoreById")
    public Store findStoreById(Long id){
        return storeService.findStoreById(id);
    }

    /**
    * @Description: 修改店铺
    * @Param: Store
    * @return: viod
    * @Author: 邓希凡
    * @Date: 2019/9/11
    */
    @RequestMapping("editStore")
    public Result editStore(Store store){
        try {
            storeService.editStore(store);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"修改失败");
    }
}
