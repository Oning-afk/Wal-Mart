package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.MemberattributeMapper;
import com.walmart.pojo.Memberattribute;
import com.walmart.pojo.MemberattributeExample;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.StorecategoryExample;
import com.walmart.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private MemberattributeMapper memberattributeMapper;

    @Override
    public List<Memberattribute> findregister() {
        return memberattributeMapper.selectByExample(null);
    }

    @Override
    public void saveregister(Memberattribute memberattribute) {
        memberattributeMapper.insert(memberattribute);
    }

    @Override
    public void delregister(Long id) {
        memberattributeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Memberattribute> findregisterid(Long id) {
        return memberattributeMapper.selectByExample(null);
    }

    @Override
    public void updateregister(Memberattribute memberattribute) {
        memberattributeMapper.updateByPrimaryKeySelective(memberattribute);

    }

    @Override
    public void delgisterall(Long[] id) {
        for (long id3:id) {
            memberattributeMapper.deleteByPrimaryKey(id3);
        }
    }

    @Override
    public PageResult findAll(Memberattribute memberattribute, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        MemberattributeExample example=new MemberattributeExample();
        MemberattributeExample.Criteria criteria=example.createCriteria();
        Page<Memberattribute> pagew= (Page<Memberattribute>) memberattributeMapper.selectByExample(null);
        long totalpage =(int) Math.ceil(pagew.getTotal()/pagew.getPageSize());
            return new PageResult(pagew.getTotal(),pagew.getResult(),page,rows,totalpage);
    }

    @Override
    public List<Memberattribute> queryList() {

        return memberattributeMapper.selectByExample(null);
    }
}
