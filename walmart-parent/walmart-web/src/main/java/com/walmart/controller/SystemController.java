package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.pojo.Area;
import com.walmart.service.SystemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: walmart-parent
 * @description: 系统
 * @author: 张晋浩
 * @create: 2019-09-17 17:14
 **/
@RequestMapping("system")
@Controller
public class SystemController {

    @Reference
    private SystemService systemService;


    /**
     * 根据pid获取地区列表
     * @param id
     * @return
     */
    @RequestMapping("getArea")
    @ResponseBody
    public List<Area> getArea(Long id){
        return systemService.getArea(id);
    }

    /**
     * 获取上一级地区列表
     * @param id
     * @return
     */
    @RequestMapping("getAreaUp")
    @ResponseBody
    public List<Area> getAreaUp(Long id){
        return systemService.getAreaUp(id);
    }

    /**
     * 删除地区
     * @param id
     * @return
     */
    @RequestMapping("deleteArea")
    @ResponseBody
    public boolean deleteArea(Long id){
        return systemService.deleteArea(id);
    }


    @RequestMapping("saveArea")
    @ResponseBody
    public boolean saveArea(Area area){

        return systemService.saveArea(area);
    }

    @RequestMapping("searchParentNameById")
    @ResponseBody
    public String searchParentNameById(Long id){
        return systemService.searchParentNameById(id);
    }

    @RequestMapping("searchAreaById")
    @ResponseBody
    public Area searchAreaById(Long id){
        return systemService.searchAreaById(id);
    }

    @RequestMapping("editAreaById")
    @ResponseBody
    public boolean editAreaById(Area area){
        return systemService.editAreaById(area);
    }
}
