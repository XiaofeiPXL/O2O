package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;


/**
 * @program: o2o
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/10/03 15:10
 */


public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;
    @Test
    public void addShop() {
        Shop shop = new Shop();
        ShopCategory shopCategory = new ShopCategory();
        Area area = new Area();
        PersonInfo personInfo = new PersonInfo();
        area.setAreaId(4);
        personInfo.setUserId(1L);
        shopCategory.setShopCategoryId(1L);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setAdvice("Processing...");
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setOwner(personInfo);
        shop.setPhone("6135818505");
        shop.setPriority(100);
        shop.setEnableStatus(1);
        shop.setShopName("StarBucks");
        shop.setShopDesc("Second best Coffee in Canada!");
        File file = new File("/Users/xiaofeiwang/Desktop/starbucks-2.jpg");
        try {
            InputStream inputStream = new FileInputStream(file);
            shopService.addShop(shop,inputStream, file.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void modifyShop() {
        Shop shop = new Shop();
        shop.setShopId(48L);
        shop.setShopAddr("Famous coffee brand");
        shop.setLastEditTime(new Date());
        File file = new File("/Users/xiaofeiwang/Desktop/iceCream-coffee.jpg");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        shopService.modifyShop(shop,inputStream,file.getName());
    }

    @Test
    public void getShopList() {
        ShopCategory shopCategory = new ShopCategory();
        Shop shop = new Shop();
        shopCategory.setShopCategoryId(36L);
        shop.setShopCategory(shopCategory);
        ShopExecution shopExecution = shopService.getShopList(shop,1,2);
        System.out.println("店铺列表数"+" "+shopExecution.getShopList().size());
        System.out.println("店铺总数"+" "+shopExecution.getCount());
    }
}