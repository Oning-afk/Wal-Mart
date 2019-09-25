package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Deliverycorp;

import java.util.List;

public interface DeliverycorpService {

    /**
     * 物流公司查询 列表
     * @param deliverycorp
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findDeliverycorp(Deliverycorp deliverycorp,Integer pageSize,Integer pageNum);

    /**
     * 物流公司 删除
     * @param ids
     * @return
     */
    boolean delDeliverycorp(String [] ids);

    /**
     * 物流公司新增
     * @param deliverycorp
     */
    public void addDeliverycorp(Deliverycorp deliverycorp);

    /**
     * 物流公司 修改
     */
    boolean edDeliverycorp(Deliverycorp deliverycorp);

    /**
     * 物流公司 回显
     */
    Deliverycorp seachDeliveryById(Long id);

    List<Deliverycorp> findStockAll();
}
