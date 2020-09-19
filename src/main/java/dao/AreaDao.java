package dao;

import entity.Area;

import java.util.List;

/**
 * @program: o2o
 * @description: AreaDao
 * @author: Xiaofei Wang
 * @created: 2020/09/19 01:11
 */

public interface AreaDao {
    /**
     * 列出区域列表
     * @return 返回区域列表
     */
    List<Area> queryArea();
}
