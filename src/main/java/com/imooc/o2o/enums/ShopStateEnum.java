package com.imooc.o2o.enums;

/**
 * @program: o2o
 * @description: 店铺操作状态枚举类
 * @author: Xiaofei Wang
 * @created: 2020/10/03 14:23
 */


public enum ShopStateEnum {

    CHECK(0, "审核中"), OFFLINE(-1, "非法店铺"), SUCCESS(1, "操作成功"), PASS(2, "通过认证"), INNER_ERROR(-1001, "内部系统错误"),
    NULL_SHOPID(-1002, "ShopId为空"), NULL_SHOP(-1003, "shop信息为空");

    private final int state;
    private final String stateInfo;

    ShopStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 依据传入的state返回相应的enum值
     */
    public static ShopStateEnum stateOf(int state) {
        for (ShopStateEnum stateEnum : values()) {
            if (stateEnum.getState() == state) {
                return stateEnum;
            }
        }
        return null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static void main(String[] args) {
        for (ShopStateEnum stateEnum : values()) {
                System.out.println(stateEnum);
            }

    }
}
