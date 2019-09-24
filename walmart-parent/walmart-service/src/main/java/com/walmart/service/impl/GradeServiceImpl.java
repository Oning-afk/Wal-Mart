package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.StorerankMapper;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.StorecategoryExample;
import com.walmart.pojo.Storerank;
import com.walmart.pojo.StorerankExample;
import com.walmart.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private StorerankMapper storerankMapper;
    @Override
    public List<Storerank> findgrade(Boolean isallowregister) {
        return storerankMapper.selectByRank(isallowregister);
    }

    @Override
    public void savegrade(Storerank storerank) {
        storerankMapper.insert(storerank);
    }

    @Override
    public void delgrade(Long id) {
        storerankMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Storerank> selectgrade(Long id) {
        return storerankMapper.selectByExample(null);
    }

    @Override
    public List<Storerank> findGradeAll() {
        return storerankMapper.selectByExample(null);
    }
    @Override
    public PageResult findAll(Storerank storerank, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        StorerankExample example=new StorerankExample();
        StorerankExample.Criteria criteria=example.createCriteria();
        if(storerank!=null){
             if(storerank.getName()!=null&&storerank.getName().length()>0){
                 criteria.andNameLike("%"+storerank.getName() +"%");
             }
        }
        Page<Storerank> pagew= (Page<Storerank>) storerankMapper.selectByExample(example);
        long totalpage=(int) Math.ceil(pagew.getTotal()/pagew.getPageSize());
        return new PageResult(pagew.getTotal(),pagew.getResult(),page,rows,totalpage);
    }
    @Override
    public List<Storerank> queryList() {

        return storerankMapper.selectByExample(null);
    }
    @Override
    public void updateGrade(Storerank storerank) {
        storerankMapper.updateByPrimaryKey(storerank);
    }

}
