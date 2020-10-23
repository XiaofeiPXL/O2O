package com.imooc.o2o.util;

/**
 * @program: o2o
 * @description: 页码和行号的转换
 * @author: Xiaofei Wang
 * @created: 2020/10/22 14:10
 */


public class PageCalculator {
    public static int calculateRowIndex(int pageIndex, int pageSize) {
        return (pageIndex > 0) ? (pageIndex - 1) * pageSize : 0;
    }
}
