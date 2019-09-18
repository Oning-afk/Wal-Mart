package com.walmart.entity;

import com.walmart.pojo.Role;

import java.util.List;

/**
 * 用户身份信息，存入session 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * 
 * @author Thinkpad
 * 
 */
public class ActiveUser implements java.io.Serializable {
	private String userid; //用户id（主键）
	private String usercode; // 用户账号
	private String username; // 用户名称

	private List<Role> menus;// 菜单
	private List<Role> permissions;// 权限

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public List<Role> getMenus() {
		return menus;
	}

	public void setMenus(List<Role> menus) {
		this.menus = menus;
	}

	public List<Role> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Role> permissions) {
		this.permissions = permissions;
	}

	
}
