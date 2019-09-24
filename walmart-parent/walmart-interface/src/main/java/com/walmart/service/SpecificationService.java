package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Specification;

public interface SpecificationService {

    /**
     * 规格管理查询 分页
     * @param specification
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageResult findSpecification(Specification specification,Integer pageSize,Integer pageNum);

    /**
     * 规格管理 批量删除
     * @param ids
     * @return
     */
    boolean delSpecification(String [] ids);
}
