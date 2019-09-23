package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Shippingmethod;
import com.walmart.pojogroup.ShippingDeliverycorpPaymentmethod;
import com.walmart.service.ShippingmethodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shippingmethod")
public class ShippingmethodController {
    @Reference
    private ShippingmethodService shippingmethodService;
    @RequestMapping("/searchShippingmethod")
    public PageResult searchShippingmethod(Shippingmethod shippingmethod, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return shippingmethodService.findPageShippingmethod(shippingmethod,rows,page);
    }
    @RequestMapping("/deleteShippingmethod")
    public boolean deleteShippingmethod(String[] ids) {
        return shippingmethodService.deleteShippingmethod(ids);
    }

    @RequestMapping("searchShippingDeliverycorpPaymentmethod")
    public ShippingDeliverycorpPaymentmethod searchShippingDeliverycorpPaymentmethod(Long id){
        return  shippingmethodService.searchShippingDeliverycorpPaymentmethod(id);
    }
    @RequestMapping("/exportStockList")
    public void  exportStockList(HttpServletResponse response){
        //获得数据信息
        List<Shippingmethod> list = shippingmethodService.findPage();
        //标题
        String title="配送方式";
        String[] rowsName=new String[]{"名称","排序"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        //定义数据集合
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getOrders();
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

