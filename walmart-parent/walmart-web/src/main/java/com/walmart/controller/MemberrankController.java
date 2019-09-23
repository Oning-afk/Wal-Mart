package com.walmart.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.walmart.entity.ExportExcel;
import com.walmart.entity.PageResult;
import com.walmart.pojo.Memberrank;
import com.walmart.service.MemberrankService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/memberrank")
public class MemberrankController {
    @Reference(timeout = 60000)
    private MemberrankService memberrankService;
    @RequestMapping("/searchMemberrank")
    public PageResult searchMemberrank(Memberrank memberrank, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "5") Integer rows){

        return memberrankService.findPageMemberrank(memberrank,rows,page);
    }
    @RequestMapping("/addMemberrank")
    public  void addMemberrank(Memberrank memberrank){
        memberrankService.addMemberrank(memberrank);
    }
    @RequestMapping("/deleteMemberrank")
    public boolean deleteMemberrank(String[] ids) {
        return memberrankService.deleteMemberrank(ids);
    }

    @RequestMapping("/searchMemberrankById")
    public Memberrank searchMemberrankById(Long id) {
        return memberrankService.searchBusinessattributeById(id);
    }
    @RequestMapping("/updateMemberrank")
    public boolean updateMemberrank(Memberrank memberrank){
        return memberrankService.updateBusinessattribute(memberrank);
    }

    @RequestMapping("/exportStockList")
    public void  exportStockList(HttpServletResponse response){
        //获得数据信息
        List<Memberrank> list = memberrankService.findPage();
        //标题
        String title="会员等级";
        String[] rowsName=new String[]{"名称","优惠比例","消费金额","是否默认"};
        //定义数据集合
        List<Object[]> dataList = new ArrayList<Object[]>();
        //定义数据集合
        for (int i = 0; i <list.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0] = list.get(i).getName();
            obj[1] = list.get(i).getScale();
            obj[2] = list.get(i).getAmount();
            if(list.get(i).getIsdefault() ==1){
                obj[3] = "是";
            }else{
                obj[3] = "否";
            }
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
