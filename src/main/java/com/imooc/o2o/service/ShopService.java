package com.imooc.o2o.service;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

import java.io.File;
import java.io.InputStream;

/**
 * @program: o2o
 * @description: Shop对象业务层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/03 14:42
 */


public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream shopImageInputStream,String fileName);
}
