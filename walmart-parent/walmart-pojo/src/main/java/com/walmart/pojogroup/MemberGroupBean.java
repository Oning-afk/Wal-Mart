package com.walmart.pojogroup;

import com.walmart.pojo.Member;
import com.walmart.pojo.Memberrank;
import com.walmart.pojo.Users;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: Wal-Mart
 * @description: 会员模块组合bean
 * @author: 邓希凡
 * @create: 2019-09-15 23:01
 **/
@Data
public class MemberGroupBean implements Serializable {

    private Member member;

    private Memberrank memberrank;

    private Users users;
}
