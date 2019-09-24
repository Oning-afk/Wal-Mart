package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.Storerank;
import com.walmart.service.GradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("grade")
public class GradeController {
    @Reference
    private GradeService gradeService;
/**
* @Param
*
* */
@RequestMapping("findGrade")
    public List<Storerank> findgrade(){

    return gradeService.findgrade();
}
    @RequestMapping("saveGrade")
    public void savegrade(Storerank storerank){
        storerank.setCreateddate(new Date());
        storerank.setLastmodifieddate(new Date());
        storerank.setIsallowregister(true);
        storerank.setVersion((long)0);
        storerank.setServicefee(BigDecimal.ONE);

    gradeService.savegrade(storerank);
    }
    @RequestMapping("delGrade")
    public void delgrade(Long id){
         gradeService.delgrade(id);
    }
    @RequestMapping("selectGrade")
    public List<Storerank> selectgrade(Long id){
        return gradeService.selectgrade(id);
    }
    @RequestMapping("delGradeall")
    public void delGradeall(Long[] id){
        gradeService.delGradeall(id);
    }
    @RequestMapping("findAll")
    public PageResult findAll(Storerank storerank, @RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "5")Integer rows){
return  gradeService.findAll(storerank,page,rows);
    }
    @RequestMapping("exportArticletagList")
    public void  exportArticletagList(HttpServletResponse response){
        List<Storerank> list=gradeService.queryList();
        String title="文章标签信息";
        String[] rowsName=new String[]{"名称","保证金","排序","内容"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getServicefee();
            obj[2] = list.get(i).getQuantity();
            obj[3] = list.get(i).getMemo();
            obj[4] = list.get(i).getVersion();
            obj[5] = list.get(i).getOrders();
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
    @RequestMapping("updateGrade")
    public void updateGrade(Storerank storerank){
        gradeService.updateGrade(storerank);
    }

}
