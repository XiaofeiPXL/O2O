package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: o2o
 * @description: 验证码工具类
 * @author: Xiaofei Wang
 * @created: 2020/10/06 21:47
 */


public class CodeUtil {
    /**
     * 检查验证码是否和预期相符
     *
     * @param request request请求
     * @return 验证码输入的校验结果
     */
    public static boolean checkVerifyCode(HttpServletRequest request) {
        String verifyCodeExpected = (String) request.getSession()
                .getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
        if (verifyCodeActual == null || !verifyCodeActual.equals(verifyCodeExpected)) {
            return false;
        }
        return true;
    }
}

