package dao;

import entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: o2o
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/09/19 01:40
 */


public class AreaDaoTest extends baseTest{

    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        for (Area area:areaList) {
            System.out.println(area);
        }
        Assert.assertEquals(3,areaList.size());
    }
}