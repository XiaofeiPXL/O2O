package com.imooc.o2o.service;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

import java.io.InputStream;

/**
 * @program: o2o
 * @description: Shop对象业务层接口
 * @author: Xiaofei Wang
 * @created: 2020/10/03 14:42
 */


public interface ShopService {

    /**
     * 根据shopCondition分页返回相应店铺列表
     * @param shopCondition 店铺查询条件
     * @param pageIndex 页码
     * @param pageSize 每页显示数据条目
     * @return 查询状态,-1表示查询失败
     */
    public ShopExecution getShopList(Shop shopCondition,int pageIndex,int pageSize);
    /**
     * 添加店铺
     * @param shop 店铺对象
     * @param shopImageInputStream 上传店铺图片的输入流
     * @param fileName 上传文件名
     * @return 操作的状态值
     */
    ShopExecution addShop(Shop shop, InputStream shopImageInputStream,String fileName) throws ShopOperationException;

    /**
     * 修改店铺信息
     * @param shop 店铺对象
     * @param shopImageInputStream 上传图片的输入流
     * @param fileName 上传文件名
     * @return 操作的状态值
     * @throws ShopOperationException 操作的异常,继承RunTimeException
     */
    ShopExecution modifyShop(Shop shop,InputStream shopImageInputStream,String fileName) throws ShopOperationException;

    /**
     * 根据id查询店铺
     * @param shopId 店铺id
     * @return 对应的店铺
     */
    Shop getByShopId(long shopId);
}
