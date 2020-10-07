package com.imooc.o2o.service;

import com.imooc.o2o.entity.ShopCategory;

import java.util.List;

/**
 * @program: o2o
 * @description: Shop相关方法的业务层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/06 17:23
 */


public interface ShopCategoryService {
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);
}
