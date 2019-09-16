package com.walmart.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ProductMapper;
import com.walmart.mapper.SkuMapper;
import com.walmart.mapper.StocklogMapper;
import com.walmart.pojo.ProductWithBLOBs;
import com.walmart.pojo.Sku;
import com.walmart.pojo.Stocklog;
import com.walmart.pojogroup.StocklogSkuGroupBean;
import com.walmart.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: Wal-Mart
 * @description: 商品-库存管理-业务层
 * @author: 张晋浩
 * @create: 2019-09-11 20:34
 **/

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StocklogMapper stocklogMapper;
    @Autowired
    private SkuMapper skuMapper;
    @Autowired
    private ProductMapper productMapper;


    @Override
    public PageResult findStockAll(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        PageResult pageResult = new PageResult();
        List<Stocklog> stocklogs = stocklogMapper.selectByExample(null);
        int count = stocklogMapper.countByExample(null);
        List<StocklogSkuGroupBean> productWithBLOBsList = new ArrayList<>();
        for (Stocklog stocklog : stocklogs) {
            StocklogSkuGroupBean stocklogSkuGroupBean = new StocklogSkuGroupBean();
            stocklogSkuGroupBean.setStocklog(stocklog);
            Sku sku = skuMapper.selectByPrimaryKey(stocklog.getSkuId());

            if(sku.getSpecificationvalues()!=null){
                String string = sku.getSpecificationvalues();
                String name = "";
                List<Map> parse = (List) JSONUtils.parse(string);
                for (Map o : parse) {
                    if(name.equals("")){
                        name = o.get("value").toString();
                    }else{
                        name += ","+ o.get("value").toString();
                    }
                    sku.setSpecificationvalues(name);
                }
            }
            stocklogSkuGroupBean.setSku(sku);
            ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(sku.getProductId());
            stocklogSkuGroupBean.setProductWithBLOBs(productWithBLOBs);
            productWithBLOBsList.add(stocklogSkuGroupBean);
        }
        return new PageResult(count,productWithBLOBsList);
    }

    @Override
    public List<StocklogSkuGroupBean> findStockAll() {
        List<Stocklog> stocklogs = stocklogMapper.selectByExample(null);
        int count = stocklogMapper.countByExample(null);
        List<StocklogSkuGroupBean> productWithBLOBsList = new ArrayList<>();
        for (Stocklog stocklog : stocklogs) {
            StocklogSkuGroupBean stocklogSkuGroupBean = new StocklogSkuGroupBean();
            stocklogSkuGroupBean.setStocklog(stocklog);
            Sku sku = skuMapper.selectByPrimaryKey(stocklog.getSkuId());

            if(sku.getSpecificationvalues()!=null){
                String string = sku.getSpecificationvalues();
                String name = "";
                List<Map> parse = (List) JSONUtils.parse(string);
                for (Map o : parse) {
                    if(name.equals("")){
                        name = o.get("value").toString();
                    }else{
                        name += ","+ o.get("value").toString();
                    }
                    sku.setSpecificationvalues(name);
                }
            }
            stocklogSkuGroupBean.setSku(sku);
            ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(sku.getProductId());
            stocklogSkuGroupBean.setProductWithBLOBs(productWithBLOBs);
            productWithBLOBsList.add(stocklogSkuGroupBean);
        }
        return productWithBLOBsList;
    }
}
