package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.ImageUtils;
import com.imooc.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.Date;

/**
 * @program: o2o
 * @description: Shop业务层接口实现类
 * @author: Xiaofei Wang
 * @created: 2020/10/03 14:44
 */

@Service("shopService")
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, InputStream shopImageInputStream,String fileName) {
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            int effectedNumber = shopDao.insertShop(shop);
            if(effectedNumber<0){
                throw new ShopOperationException("Add shop failed,please check all input and try again!");
            }else{
                if(shopImageInputStream !=null){
                    try {
                        addShopImage(shop, shopImageInputStream,fileName);
                    } catch (Exception e) {
                        throw new ShopOperationException("Add shopImageInputStream failed "+e.getMessage());
                    }
                    effectedNumber = shopDao.updateShop(shop);
                    if(effectedNumber<0){
                        throw new ShopOperationException("Update shop image failed");
                    }
                }
            }
        } catch (Exception e) {
            throw new ShopOperationException("Add shop error" + e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK,shop);
    }

    private void addShopImage(Shop shop, InputStream shopImageInputStream,String fileName) {
        //获取shop图片的相对路径
        String destination = PathUtil.getShopImagePath(shop.getShopId());
        String shopImageAddress = ImageUtils.generateThumbnail(shopImageInputStream,fileName,destination);
        shop.setShopImg(shopImageAddress);
    }
}
