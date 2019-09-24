package com.walmart.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Pointlog;
import com.walmart.pojo.Storerank;
import com.walmart.service.ManageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("manage")
public class ManageController {
@Reference
    private ManageService manageService;
@RequestMapping("findmanage")
public List<Pointlog> findmanage(){

    return manageService.findmanage();
}
    @RequestMapping("savemanage")
   public void savemanage(Pointlog pointlog){
        pointlog.setCreateddate(new Date());
        pointlog.setLastmodifieddate(new Date());
        pointlog.setBalance(1);
        pointlog.setMemberId(1111);

    manageService.savemanage(pointlog);
    }
    @RequestMapping("delmanage")
   public void delmanager(Long id){

    manageService.delmanager(id);
   }
   @RequestMapping("findmanageid")
   public List<Pointlog> findmanageid(Long id){

    return  manageService.findmanageid(id);
   }
   @RequestMapping("updatemanage")
   public void findmanageid(Pointlog pointlog){

    manageService.updatemanage(pointlog);
   }
    @RequestMapping("delmanageall")
    public void delmanageall(Long[] id){

    manageService.delmanageall(id);
    }
    @RequestMapping("findAll")
    public PageResult findAll(Pointlog pointlog,@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "5")Integer rows){

     return    manageService.findAll(pointlog,page,rows);
    }
    @RequestMapping("exportArticletagList")
    public void  exportArticletagList(HttpServletResponse response){
        List<Pointlog> list=manageService.queryList();
        String title="文章标签信息";
        String[] rowsName=new String[]{"名称","保证金","排序","内容"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getType();
            obj[1] = list.get(i).getCredit();
            obj[2] = list.get(i).getDebit();
            obj[3] = list.get(i).getVersion();
            obj[4] = list.get(i).getMemberId();
            obj[5] = list.get(i).getMemo();
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
