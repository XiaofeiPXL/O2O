package com.imooc.o2o.exceptions;

/**
 * @program: o2o
 * @description: 添加店铺异常的工具类
 * @author: Xiaofei Wang
 * @created: 2020/10/03 15:05
 */


public class ShopOperationException extends RuntimeException {
    public ShopOperationException(String message){
        super(message);
    }
}
