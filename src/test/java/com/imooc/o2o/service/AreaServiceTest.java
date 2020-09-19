package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: o2o
 * @description: AreaService的测试类
 * @author: Xiaofei Wang
 * @created: 2020/09/19 16:17
 */


public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList = areaService.getAreaList();
        for(Area area : areaList){
            System.out.println(area);
        }
        assertEquals(3,areaList.size());
    }
}
