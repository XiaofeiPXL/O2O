package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

/**
 * @program: o2o
 * @description: 店铺操作接口
 * @author: Xiaofei Wang
 * @created: 2020/10/01 23:09
 */


public interface ShopDao {
    /**
     * 新增店铺
     * @param shop 店铺对象
     * @return 影响的行数,-1代表插入失败
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @param shop 店铺对象
     * @return 影响的行数,-1代表更新失败
     */
    int updateShop(Shop shop);

    /**
     * 通过shopId查询店铺信息
     * @param shopId shopId
     * @return 相应的店铺对象
     */
    Shop queryByShopId(long shopId);
}
