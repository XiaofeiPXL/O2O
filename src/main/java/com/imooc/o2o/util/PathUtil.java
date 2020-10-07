package com.imooc.o2o.util;

/**
 * @program: o2o
 * @description: 路径处理工具类
 * @author: Xiaofei Wang
 * @created: 2020/10/03 12:17
 */


public class PathUtil {
    private static final String separator = System.getProperty("file.separator");
    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath;
        if(os.toLowerCase().startsWith("win")){
            basePath = "D:/projectDev/image/";
        }else{
            basePath ="/Users/xiaofeiwang/Documents/image";
        }
        basePath = basePath.replace("/", separator);
        return basePath;
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + separator;
        return imagePath.replace("/", separator);
    }
}
