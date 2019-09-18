package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Business;

public interface BusinessService {

    /**
     * 商家管理 查询
     * @param business
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findPageBusiness(Business business,Integer pageSize,Integer pageNum);

    /**
     * 商家管理 删除
     * @param ids
     * @return
     */
    boolean delBusiness(String [] ids);
}
