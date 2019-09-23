package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojogroup.ProductStoreGroupBean;
import com.walmart.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Wal-Mart
 * @description: 商品-controller
 * @author: 张晋浩
 * @create: 2019-09-11 09:18
 **/
@RequestMapping("product")
@Controller
public class ProductController {

    @Reference
    private ProductService productService;

    /**
     * 商品-商品管理列表查询
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("findAll")
    @ResponseBody
    public PageResult findProductList(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows,String name){

        return productService.findProductList(rows,page,name);
    }

    /**
     * 商品-商品管理上架
     * @param id
     */
    @RequestMapping("updateToUp")
    @ResponseBody
    public boolean updateToUp(Long id){
        return productService.updateToUp(id);
    }

    /**
     * 商品-商品管理下架
     * @param id
     */
    @RequestMapping("updateToDown")
    @ResponseBody
    public boolean updateToDown(Long id){
        return productService.updateToDown(id);
    }

    @RequestMapping("deleteProduct")
    @ResponseBody
    public boolean deleteProduct(Long[] ids){
        return productService.deleteProduct(ids);
    }

    @RequestMapping("/exportProductList")
    public void  exportStockList(HttpServletResponse response){
        //获得数据信息
        List<ProductStoreGroupBean> list = productService.findProductAll();;
        //标题
        String title="商品管理信息";
        String[] rowsName=new String[]{"编号","名称","商品分类","销售价","是否上架","是否有效","店铺","创建日期"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getProduct().getSn();
            obj[1] = list.get(i).getProduct().getName();
            obj[2] = list.get(i).getProductCategoryBean().getName();
            obj[3] = list.get(i).getProduct().getPrice();
            if(list.get(i).getProduct().getIsmarketable()){
                obj[4] = "上架";
            }else{
                obj[4] = "已下架";
            }
            if(list.get(i).getProduct().getIsactive()){
                obj[5] = "有效";
            }else{
                obj[5] = "已失效";
            }
            obj[6] = list.get(i).getStore().getName();
            String dateString = formatter.format(list.get(i).getProduct().getCreateddate());
            obj[7] = dateString;
            dataList.add(obj);
        }
        ExportExcel exportExcel = new ExportExcel(title, rowsName,dataList,response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
