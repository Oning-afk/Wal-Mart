package com.walmart.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.walmart.entity.Common;
import com.walmart.entity.PageResult;
import com.walmart.mapper.ProductMapper;
import com.walmart.mapper.StoreMapper;
import com.walmart.pojo.Product;
import com.walmart.pojo.ProductEnmu;
import com.walmart.pojo.ProductExample;
import com.walmart.pojo.Store;
import com.walmart.pojogroup.ProductStoreGroupBean;
import com.walmart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @program: walmart-parent
 * @description: 购物车业务层
 * @author: 张晋浩
 * @create: 2019-09-24 09:11
 **/
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public void addToShopCart(Long skuId, Integer quantity) {
        String cache = Common.CART_CACHE;
        HashMap<Long, Object> hashMap = new HashMap<>();
        if(redisTemplate.hasKey(cache)){
            String string = redisTemplate.opsForValue().get(cache).toString();
            List<Map> list = JSON.parseObject(string, List.class);
            boolean isExsit = false;
            for (Map map : list) {
                if(map.containsKey(skuId)){
                    isExsit =true;
                    Integer count = (Integer)map.get("quantity");
                    map.put(skuId,count+quantity);
                }
            }
            if(isExsit == false){
                hashMap.put(skuId,quantity);
                list.add(hashMap);
                String jsonString = JSON.toJSONString(list);
                redisTemplate.opsForValue().set(cache,jsonString,30, TimeUnit.MINUTES);
            }
        }else{
            List<Map> list = new ArrayList<>();
            hashMap.put(skuId,quantity);
            list.add(hashMap);
            String jsonString = JSON.toJSONString(list);
            redisTemplate.opsForValue().set(cache,jsonString,30, TimeUnit.MINUTES);
        }

    }

    @Override
    public Integer getCartCount() {
        String cache = Common.CART_CACHE;
        if(redisTemplate.hasKey(cache)){
            String s = redisTemplate.opsForValue().get(cache).toString();
            List<Map> list = JSON.parseObject(s, List.class);
            Integer count = 0;
            for (Map map : list) {
                for (Object skuId : map.keySet()) {
                    Integer quantity = (Integer) map.get(skuId);
                    count += (Integer)quantity;
                }
            }
            return count;
        }
        return 0;
    }

    @Override
    public List<ProductStoreGroupBean> queryCartDetail() {
        String cache = Common.CART_CACHE;
        List<ProductStoreGroupBean> productStoreGroupBean = new ArrayList<>();
        if(redisTemplate.hasKey(cache)){
            String s = redisTemplate.opsForValue().get(cache).toString();
            List<Map> list = JSON.parseObject(s, List.class);
            List<Long> arrayList = new ArrayList<>();
            for (Map map : list) {
                for (Object skuIds : map.keySet()) {
                    Long skuId = Long.parseLong(skuIds.toString()) ;
                    arrayList.add(skuId);
                }
            }
            ProductExample productExample = new ProductExample();
            ProductExample.Criteria criteria = productExample.createCriteria();
            criteria.andIdIn(arrayList);
            List<Product> products = productMapper.selectByExample(productExample);
            for (Product product : products) {
                ProductStoreGroupBean productStoreGroupBeans = new ProductStoreGroupBean();
                Store store = storeMapper.selectByPrimaryKey(product.getStoreId());
                productStoreGroupBeans.setProduct(product);
                productStoreGroupBeans.setStore(store);
                productStoreGroupBean.add(productStoreGroupBeans);
            }
            return productStoreGroupBean;
        }
        return productStoreGroupBean;
    }

    @Override
    public List queryCartQuantity() {
        String cache = Common.CART_CACHE;
        List<ProductEnmu> productEnmus = new ArrayList<>();
        if(redisTemplate.hasKey(cache)){
            String s = redisTemplate.opsForValue().get(cache).toString();
            List<Map> list = JSON.parseObject(s, List.class);
            Integer count = 0;
            for (Map map : list) {
                for (Object skuId : map.keySet()) {
                    ProductEnmu productEnmu = new ProductEnmu();
                    productEnmu.setSkuId(Long.parseLong(skuId.toString()));
                    productEnmu.setQuantity((Integer) map.get(skuId));
                    productEnmus.add(productEnmu);
                }
            }
        }
        return productEnmus;
    }


}
