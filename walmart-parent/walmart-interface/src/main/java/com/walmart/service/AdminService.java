package com.walmart.service;

import com.walmart.pojo.Admin;
import com.walmart.pojo.Role;

import java.util.List;

public interface AdminService {

    /**
    * @Description: 查询用户信息
    * @Param:
    * @return:
    * @Author: 邓希凡
    * @Date: 2019/9/18
    */
    Admin findAdmin(String username);

    /**
    * @Description: 通过用户id查询用户所拥有的权限
    * @Param: 用户id
    * @return:
    * @Author: 邓希凡
    * @Date: 2019/9/18
    */
    List<Role> findRole(String id);
}
