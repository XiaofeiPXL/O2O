package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: o2o
 * @description: 获取店铺类别持久层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/06 16:59
 */


public interface ShopCategoryDao {
    /**
     * 根据传入的查询条件返回店铺类别列表
     *
     * @param shopCategoryCondition 查询类别的附加条件
     * @return 店铺类别列表
     */
    List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition") ShopCategory shopCategoryCondition);
}
