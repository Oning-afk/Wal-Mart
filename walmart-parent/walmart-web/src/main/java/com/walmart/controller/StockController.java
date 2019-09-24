package com.walmart.controller;

import com.alibaba.druid.sql.PagerUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Stocklog;
import com.walmart.pojogroup.StocklogSkuGroupBean;
import com.walmart.service.StockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: Wal-Mart
 * @description: 商品-库存管理-控制层
 * @author: 张晋浩
 * @create: 2019-09-11 20:31
 **/
@RequestMapping("stock")
@Controller
public class StockController {

    @Reference
    private StockService stockService;


    /**
     * 商品-库存管理-查询分页
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("findStockAll")
    @ResponseBody
    public PageResult findStockAll(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows, Integer skuId,String name){
        return stockService.findStockAll(page,rows,skuId,name);
    }

    @RequestMapping("/exportStockList")
    public void  exportStockList(HttpServletResponse response){
        //获得数据信息
        List<StocklogSkuGroupBean> list = stockService.findStockAll();;
        //标题
        String title="库存管理信息";
        String[] rowsName=new String[]{"编号","商品","类型","入库数量","出库数量","当前库存","备注","创建日期"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getSku().getSn();
            if(list.get(i).getSku().getSpecificationvalues() !=null && !list.get(i).getSku().getSpecificationvalues().equals("")){
                obj[1] = list.get(i).getProductWithBLOBs().getName()+"["+list.get(i).getSku().getSpecificationvalues()+"]";
            }else{
                obj[1] = list.get(i).getProductWithBLOBs().getName();
            }

            if(list.get(i).getStocklog().getType() ==0){
                obj[2] = "入库";
            }else{
                obj[2] = "出库";
            }
            obj[3] = list.get(i).getStocklog().getInquantity();
            obj[4] = list.get(i).getStocklog().getOutquantity();
            obj[5] = list.get(i).getStocklog().getStock();
            obj[6] = list.get(i).getStocklog().getMemo();
            String dateString = formatter.format(list.get(i).getStocklog().getCreateddate());
            obj[7] = dateString;
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
