package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.AdminMapper;
import com.walmart.mapper.RoleMapper;
import com.walmart.pojo.Admin;
import com.walmart.pojo.AdminExample;
import com.walmart.pojo.Role;
import com.walmart.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: Wal-Mart
 * @description: 后台用户
 * @author: 邓希凡
 * @create: 2019-09-18 08:33
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Admin findAdmin(String username) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        if(username!=null&&username.length()>0){
            criteria.andUsernameEqualTo(username);
            List<Admin> admins = (List<Admin>) adminMapper.selectByExample(adminExample);
            return admins.get(0);
        }
        return null;
    }

    @Override
    public List<Role> findRole(String id) {

        List<Role> role = roleMapper.findRole(id);
        return role;
    }
}
