package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;


/**
 * @program: o2o
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/10/01 23:23
 */


public class ShopDaoTest extends BaseTest {

    @Autowired
    private ShopDao shopDao;

    @Before
    public void setUp() throws Exception {
        System.out.println("持久层的测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("所有测试已经完成");
    }

    @Test
    public void insertShop() {
        Shop shop = new Shop();
        ShopCategory shopCategory = new ShopCategory();
        Area area = new Area();
        PersonInfo personInfo = new PersonInfo();
        area.setAreaId(4);
        personInfo.setUserId(1L);
        shopCategory.setShopCategoryId(1L);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setAdvice("new shop created");
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setOwner(personInfo);
        shop.setPhone("6135818505");
        shop.setPriority(100);
        shop.setEnableStatus(1);
        shop.setShopName("Tim Hortons");
        shopDao.insertShop(shop);

    }

    @Test
    public void updateShop() {
        Shop shop = new Shop();
        shop.setShopId(36L);
        shop.setShopDesc("Best Coffee in Canada!");
        shop.setLastEditTime(new Date());
        shopDao.updateShop(shop);
    }
}