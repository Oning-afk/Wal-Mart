package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.MemberMapper;
import com.walmart.mapper.MemberrankMapper;
import com.walmart.mapper.UsersMapper;
import com.walmart.pojo.Member;
import com.walmart.pojo.MemberExample;
import com.walmart.pojo.Memberrank;
import com.walmart.pojo.Users;
import com.walmart.pojogroup.MemberGroupBean;
import com.walmart.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program: Wal-Mart
 * @description: 会员模块业务层
 * @author: 邓希凡
 * @create: 2019-09-15 22:36
 **/
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberrankMapper memberrankMapper;

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public PageResult findMember(int pageSize, int pageNum, Member member) {
        PageHelper.startPage(pageNum,pageSize);
        MemberExample memberExample = new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        Page<Member> members = (Page<Member>) memberMapper.selectByExample(memberExample);
        Page<MemberGroupBean> memberGroupBeans = new Page<MemberGroupBean>();
        memberGroupBeans.setTotal(members.getTotal());
        for (Member member1 : members) {
            MemberGroupBean memberGroupBean = new MemberGroupBean();
            Memberrank memberrank = memberrankMapper.selectByPrimaryKey(member1.getMemberrankId());
            Users users = usersMapper.selectByPrimaryKey(member1.getId());
            memberGroupBean.setUsers(users);
            memberGroupBean.setMemberrank(memberrank);
            memberGroupBean.setMember(member1);
            memberGroupBeans.add(memberGroupBean);
        }
        long totalPage= (int) Math.ceil(members.getTotal()/members.getPageSize());
        return new PageResult(memberGroupBeans.getTotal(),memberGroupBeans.getResult(),pageNum,pageSize,totalPage);
    }
}
