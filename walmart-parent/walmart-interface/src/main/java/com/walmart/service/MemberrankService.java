package com.walmart.service;

import com.walmart.entity.PageResult;
import com.walmart.pojo.Memberrank;

import java.util.List;

public interface MemberrankService {
    /**
     *会员等级查询
     * @param memberrank
     * @param pageSize
     * @param pageNum
     * @return
     */

    PageResult findPageMemberrank(Memberrank memberrank, int pageSize, int pageNum);

    /**
     * 会员管理新增
     * @param memberrank
     */
    void addMemberrank(Memberrank memberrank);
    /**
     * 会员管理删除
     * @param ids
     */
    boolean deleteMemberrank(String[] ids);

    Memberrank searchBusinessattributeById(Long id);

    boolean updateBusinessattribute(Memberrank memberrank);

   public List<Memberrank> findPage();
}
