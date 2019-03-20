package com.tencent.gaio.workorder.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String create() {
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        String s = "测试不更新demo4，只更新demo5项目，重新从git上面拉取并部署到服务器成功,时间是："+format;
        return s;
    }


}
