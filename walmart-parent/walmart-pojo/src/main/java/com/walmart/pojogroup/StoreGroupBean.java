package com.walmart.pojogroup;

import com.walmart.pojo.Business;
import com.walmart.pojo.Store;
import com.walmart.pojo.Storecategory;
import com.walmart.pojo.Storerank;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: Wal-Mart
 * @description:
 * @author: 邓希凡
 * @create: 2019-09-10 20:38
 **/
@Data
public class StoreGroupBean implements Serializable {

    private Store store;

    private Business business;

    private Storerank storerank;

    private Storecategory storecategory;

}
