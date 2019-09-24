package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.walmart.mapper.AreaMapper;
import com.walmart.pojo.Area;
import com.walmart.pojo.AreaExample;
import com.walmart.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * @program: walmart-parent
 * @description: 系统-业务层
 * @author: 张晋浩
 * @create: 2019-09-17 17:20
 **/
@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> getArea(Long id) {
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
        if(id !=null){
            criteria.andParentIdEqualTo(id);
        }else{
            criteria.andGradeEqualTo(0);
        }
        return areaMapper.selectByExampleWithBLOBs(areaExample);
    }

    @Override
    public List<Area> getAreaUp(Long id) {
        List<Area> list = null;
        Area area = areaMapper.selectByPrimaryKey(id);
        Area area1 = areaMapper.selectByPrimaryKey(area.getParentId());
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
        if(area.getParentId() == null){
            criteria.andGradeEqualTo(0);
            list = areaMapper.selectByExampleWithBLOBs(areaExample);
            return list;
        }
        criteria.andParentIdEqualTo(area.getParentId());
        list = areaMapper.selectByExampleWithBLOBs(areaExample);
        list.get(0).setFullname(area1.getName());
        return list;
    }

    @Override
    public boolean deleteArea(Long id) {
        return areaMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean saveArea(Area area) {
        area.setVersion((long) 0);
        if(area.getParentId() != 0){
            Area systemAreaBean1 = areaMapper.selectByPrimaryKey(area.getParentId());
            area.setFullname(systemAreaBean1.getFullname()+area.getName());
            area.setGrade(systemAreaBean1.getGrade()+1);
            if(systemAreaBean1.getParentId() == null){
                area.setTreepath(","+systemAreaBean1.getId()+",");
            }else{
                String [] result = systemAreaBean1.getTreepath().split(",");
                area.setTreepath(","+result[0]+","+area.getParentId()+",");
            }
        }else{
            area.setFullname(area.getName());
            area.setGrade(0);
            area.setTreepath(",");
            area.setParentId(null);
        }
        area.setCreateddate(new Date());
        area.setLastmodifieddate(new Date());
        return areaMapper.insert(area)>0;
    }

    @Override
    public String searchParentNameById(Long id) {
        String name = "";
        if(id == 0){
            name = "顶级地区";
        }else{
            Area area = areaMapper.selectByPrimaryKey(id);
            name = area.getName();
        }
        return name;
    }

    @Override
    public Area searchAreaById(Long id) {
        Area area = areaMapper.selectByPrimaryKey(id);
        if(area.getParentId() == null){
            area.setFullname("顶级地区");
        }else{
            Area area1 = areaMapper.selectByPrimaryKey(area.getParentId());
            area.setFullname(area1.getName());
        }
        return area;
    }

    @Override
    public boolean editAreaById(Area area) {
        return areaMapper.updateByPrimaryKeySelective(area) > 0;
    }
}
