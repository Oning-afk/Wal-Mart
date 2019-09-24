package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Memberattribute;
import com.walmart.pojo.Parameter;
import com.walmart.pojo.Pointlog;
import com.walmart.service.RegisterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("register")
public class RegisterController {
@Reference
    private RegisterService registerService;
@RequestMapping("findregister")
    public List<Memberattribute> findregister(){

    return registerService.findregister();
}
    @RequestMapping("saveregister")
    public void saveregister(Memberattribute memberattribute){
        memberattribute.setCreateddate(new Date());
        memberattribute.setLastmodifieddate(new Date());
        memberattribute.setVersion(1);
        memberattribute.setIsenabled(true);
        memberattribute.setPropertyindex(1);
        memberattribute.setPattern("");
        memberattribute.setOptions("");
        memberattribute.setIsrequired(false);
    registerService.saveregister(memberattribute);
    }
    @RequestMapping("delregister")
    public void delregister(Long id){
        registerService.delregister(id);
    }
    @RequestMapping("findregisterid")
    public List<Memberattribute> findregisterid(Long id){
       return registerService.findregisterid(id);
    }
    @RequestMapping("updateregister")
    public void updateregister(Memberattribute memberattribute){

    registerService.updateregister(memberattribute);
    }
    @RequestMapping("delgisterall")
    public void  delgisterall(Long[] id){

    registerService.delgisterall(id);
    }
    @RequestMapping("findAll")
    public PageResult findAll(Memberattribute memberattribute, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "3") Integer rows){

      return   registerService.findAll(memberattribute,page,rows);
    }
    @RequestMapping("exportArticletagList")
    public void  exportArticletagList(HttpServletResponse response){
        List<Memberattribute> list=registerService.queryList();
        String title="文章标签信息";
        String[] rowsName=new String[]{"名称","保证金","排序","内容"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getType();
            obj[2] = list.get(i).getIsenabled();
            obj[3] = list.get(i).getIsrequired();
            obj[4] = list.get(i).getOrders();
            dataList.add(obj);
        }
        ExportExcel exportExcel = new ExportExcel(title, rowsName,dataList,response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String ss = "";
    }
}
