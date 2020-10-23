package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: o2o
 * @description: 店铺操作接口
 * @author: Xiaofei Wang
 * @created: 2020/10/01 23:09
 */


public interface ShopDao {
    /**
     * 新增店铺
     *
     * @param shop 店铺对象
     * @return 影响的行数,-1代表插入失败
     */
    int insertShop(Shop shop);

    /**
     * 更新店铺信息
     *
     * @param shop 店铺对象
     * @return 影响的行数,-1代表更新失败
     */
    int updateShop(Shop shop);

    /**
     * 通过shopId查询店铺信息
     *
     * @param shopId shopId
     * @return 相应的店铺对象
     */
    Shop queryByShopId(long shopId);

    /**
     * 分页查询店铺，可输入的条件有：店铺名(模糊),店铺状态，店铺类别，区域Id,owner
     *
     * @param shopCondition 查询的店铺信息
     * @param rowIndex      从第几行开始取数据
     * @param pageSize      返回的条数
     * @return
     */
    List<Shop> queryShopList(@Param("shopCondition") Shop shopCondition, @Param("rowIndex") int rowIndex,
                             @Param("pageSize") int pageSize);

    /**
     * 返回queryShopList总数
     *
     * @param shopCondition 查询条件
     * @return 一个店家对应的全部商店个数
     */
    int queryShopCount(@Param("shopCondition") Shop shopCondition);

}
