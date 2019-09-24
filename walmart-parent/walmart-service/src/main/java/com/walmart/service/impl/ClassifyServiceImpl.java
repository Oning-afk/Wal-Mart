package com.walmart.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.StorecategoryMapper;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.StorecategoryExample;
import com.walmart.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private StorecategoryMapper storecategoryMapper;
    @Override
    public List<Storecategory> findclassify() {
        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void saveclassify(Storecategory storecategory) {
        storecategoryMapper.insert(storecategory);
    }

    @Override
    public void dleclassify(Long id) {
        storecategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Storecategory selectclassify(Long id) {

        return storecategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void delclassifyall(Long[] id) {
        for (long id4:id) {
            storecategoryMapper.deleteByPrimaryKey(id4);
        }
    }

    @Override
    public PageResult findAll(Storecategory storecategory, Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        StorecategoryExample example = new StorecategoryExample();
        StorecategoryExample.Criteria criteria = example.createCriteria();
        if(storecategory != null){
            if(storecategory.getName() !=null&&storecategory.getName().length() >=0){

                criteria.andNameLike("%"+storecategory.getName()+"%");
            }
        }
        Page<Storecategory> pagew= (Page<Storecategory>) storecategoryMapper.selectByExample(example);
        long totalpage=(int) Math.ceil(pagew.getTotal()/pagew.getPageSize());
        return new PageResult(pagew.getTotal(),pagew.getResult(),page,rows,totalpage);
    }

    @Override
    public List<Storecategory> queryList() {

        return storecategoryMapper.selectByExample(null);
    }

    @Override
    public void updateclassify(Storecategory storecategory) {
        storecategoryMapper.updateByPrimaryKey(storecategory);
    }

    @Override
    public PageResult findPageBrand(Storecategory storecategory, int pageSize, int pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        StorecategoryExample example=new StorecategoryExample();
        StorecategoryExample.Criteria criteria=example.createCriteria();
        Page<Storecategory> page= (Page<Storecategory>) storecategoryMapper.selectByExample(example);
        return new PageResult(page.getTotal(),page.getResult());
    }
}
