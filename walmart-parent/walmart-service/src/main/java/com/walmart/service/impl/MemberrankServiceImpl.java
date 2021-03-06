package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.MemberrankMapper;

import com.walmart.pojo.Memberrank;
import com.walmart.pojo.MemberrankExample;
import com.walmart.service.MemberrankService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MemberrankServiceImpl implements MemberrankService {
    @Autowired
    private MemberrankMapper memberrankMapper;
    @Override
    public PageResult findPageMemberrank(Memberrank memberrank, int pageSize, int pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        MemberrankExample memberrankExample = new MemberrankExample();
        MemberrankExample.Criteria criteria = memberrankExample.createCriteria();
        if (memberrank.getName()!=null){
            if (memberrank.getName() !=null && memberrank.getName().length() >0){
                criteria.andNameLike( "%" + memberrank.getName() +"%");
            }
        }
        Page<Memberrank> page = (Page<Memberrank>) memberrankMapper.selectByExample(memberrankExample);
        return new PageResult(page.getTotal(),page.getResult());
    }

    @Override
    public void addMemberrank(Memberrank memberrank) {
        memberrankMapper.insert(memberrank);
    }

    @Override
    public boolean deleteMemberrank(String[] ids) {
        int i =0;
        for (String id: ids){
            i = memberrankMapper.deleteByPrimaryKey(Long.parseLong(id));
        }
        if (i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Memberrank searchBusinessattributeById(Long id) {
        return memberrankMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateBusinessattribute(Memberrank memberrank) {
        return memberrankMapper.updateByPrimaryKeySelective(memberrank)>0;
    }

    @Override
    public List<Memberrank> findPage() {
        return memberrankMapper.selectByExample(null);
    }
}
