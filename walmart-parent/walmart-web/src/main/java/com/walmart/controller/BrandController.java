package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Brand;
import com.walmart.pojo.Businessattribute;
import com.walmart.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference(timeout = 60000)
    private BrandService brandService;

    @RequestMapping("/searchBrand")
    public PageResult searchBrand(Brand brand, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return brandService.findPageBrand(brand,rows,page);
    }
    @RequestMapping("/addBrand")
    public void addBrand(Brand brand){
        brandService.addBrand(brand);
    }
    @RequestMapping("/deleteBrand")
    public boolean deleteBrand(String[] ids) {
        return brandService.deleteBrand(ids);
    }

    @RequestMapping("/exportStockList")
    public void  exportStockList(HttpServletResponse response){
        //获得数据信息
        List<Brand> list = brandService.findPage();
        //标题
        String title="品牌管理";
        String[] rowsName=new String[]{"名称","logo","网址","排序"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        //定义数据集合
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getLogo();
            obj[2] = list.get(i).getUrl();
            obj[3] = list.get(i).getOrders();
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
