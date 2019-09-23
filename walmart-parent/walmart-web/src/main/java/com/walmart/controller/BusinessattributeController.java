package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.entity.Result;
import com.walmart.pojo.Businessattribute;
import com.walmart.service.BusinessattributeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/businessattribute")
public class BusinessattributeController {
    @Reference(timeout = 60000)
    private BusinessattributeService businessattributeService;

    @RequestMapping("/searchBusinessattribute")
    public PageResult searchBusinessattribute(Businessattribute businessattribute, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return businessattributeService.findPageBusinessattribute(businessattribute,rows,page);
    }
    @RequestMapping("/deleteBusinessattribute")
    public Result deleteBusinessattribute(Long[] ids){
        try {
            businessattributeService.deleteBusinessattribute(ids);
            return new Result(true,"删除成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  new Result(false,"删除失败！");
    }
    @RequestMapping("/searchBusinessattributeById")
    public Businessattribute searchBusinessattributeById(Long id) {
        return businessattributeService.searchBusinessattributeById(id);
    }
    @RequestMapping("/updateBusinessattribute")
    public boolean updateBusinessattribute(Businessattribute businessattribute){
        return businessattributeService.updateBusinessattribute(businessattribute);
    }
    @RequestMapping("/addBusinessattribute")
    public void addBusinessattribute(Businessattribute businessattribute){
        businessattributeService.addBusinessattribute(businessattribute);
    }
    @RequestMapping("/exportStockList")
    public void  exportStockList(HttpServletResponse response){
        //获得数据信息
        List<Businessattribute> list = businessattributeService.findPage();
        //标题
        String title="商家注册项";
        String[] rowsName=new String[]{"名称","类型","是否必填","是否启用","排序"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        //定义数据集合
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getName();
            if(list.get(i).getIsrequired() ==0){
                obj[2] = "是";
            }else{
                obj[2] = "否";
            }

            if(list.get(i).getIsenabled() ==0){
                obj[3] = "是";
            }else{
                obj[3] = "否";
            }
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
