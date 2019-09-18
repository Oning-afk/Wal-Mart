package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.MemberattributeMapper;
import com.walmart.pojo.Memberattribute;
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
}
