package com.imooc.o2o.web.shopAdmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: o2o
 * @description: shop界面的前端路由
 * @author: Xiaofei Wang
 * @created: 2020/10/06 14:21
 */

@Controller
@RequestMapping(value = "shopadmin",method = RequestMethod.GET)
public class shopAdminController {
    @RequestMapping(value="/shopoperation")
    public String shopOperation(){
        return "shop/shopoperation";
    }
}
