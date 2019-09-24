package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.Storerank;
import com.walmart.service.ClassifyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("classify")
public class ClassifyController {
    @Reference
    private ClassifyService classifyService;
    @RequestMapping("findclassify")
    public List<Storecategory> findclassify(){
        return classifyService.findclassify();
    }
    @RequestMapping("saveclassify")
    public void saveclassify(Storecategory storecategory){
        storecategory.setCreateddate(new Date());
        storecategory.setLastmodifieddate(new Date());
        storecategory.setName("ss");
        storecategory.setOrders(1);

        classifyService.saveclassify(storecategory);
    }
    @RequestMapping("dleclassify")
    public void dleclassify(Long id){

        classifyService.dleclassify(id);
    }
    @RequestMapping("selectclassify")
    public Storecategory selectclassify(Long id){

        return classifyService.selectclassify(id);
    }
    @RequestMapping("delclassifyall")
    public void delclassifyall(Long[] id){
        classifyService.delclassifyall(id);
    }
    @RequestMapping("findAll")
    public PageResult findAll(Storecategory storecategory, @RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "5")Integer rows){
      return  classifyService.findAll(storecategory,page,rows);
    }
    @RequestMapping("exportArticletagList")
    public void  exportArticletagList(HttpServletResponse response){
        List<Storecategory> list=classifyService.queryList();
        String title="文章标签信息";
        String[] rowsName=new String[]{"名称","保证金","排序","内容"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getBail();
            obj[2] = list.get(i).getOrders();
            obj[3]=list.get(i).getVersion();
            dataList.add(obj);
        }
        ExportExcel exportExcel = new ExportExcel(title, rowsName,dataList,response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("updateclassify")
    public void updateclassify(Storecategory storecategory){
        classifyService.updateclassify(storecategory);
    }
    @RequestMapping("findPageBrand")
    public PageResult findPageBrand(Storecategory storecategory,@RequestParam(defaultValue = "1")int pageSize,@RequestParam(defaultValue = "1")int pageNum){
        return  classifyService.findPageBrand(storecategory,pageSize,pageNum);
    }
    }


