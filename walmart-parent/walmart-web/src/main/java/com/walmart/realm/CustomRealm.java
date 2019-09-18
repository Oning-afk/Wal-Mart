package com.walmart.realm;

import com.walmart.entity.ActiveUser;
import com.walmart.pojo.Admin;
import com.walmart.pojo.Role;
import com.walmart.service.AdminService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Wal-Mart
 * @description: 过滤器
 * @author: 邓希凡
 * @create: 2019-09-17 22:01
 **/
public class CustomRealm extends AuthorizingRealm {

    private AdminService adminService;

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }
    
    /** 
    * @Description: 授权器 
    * @Param: principalCollection
    * @return:  
    * @Author: 邓希凡 
    * @Date: 2019/9/17 
    */ 
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //获取用户信息
        ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();
        //通过用户id获取用户所拥有的权限
        List<Role> role = adminService.findRole(activeUser.getUserid());
        List<String> list = new ArrayList<>();
        for (Role role1 : role) {
            list.add(role1.getPermissions());
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(list);
        return simpleAuthorizationInfo;
    }
    
    /** 
    * @Description: 认证器 
    * @Param: Token
    * @return:  
    * @Author: 邓希凡 
    * @Date: 2019/9/17 
    */ 
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //获得用户名
        String username = (String) token.getPrincipal();

        //从数据库中获取用户信息
        Admin admin = adminService.findAdmin(username);
        if(admin==null){
            return null;
        }

        ActiveUser activeUser = new ActiveUser();
        activeUser.setUsercode(admin.getUsername());
        activeUser.setUserid(admin.getId().toString());
        activeUser.setUsername(admin.getUsername());
        //获取密码
        String password = admin.getEncodedpassword();
        
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(activeUser,password, ByteSource.Util.bytes(admin.getName()),this.getName());


        return simpleAuthenticationInfo;
    }
}
