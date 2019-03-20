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
        String s = "不更新demo4，只更新demo5项目，看看demo4有没有重新部署,时间是："+format;
        return s;
    }

    @RequestMapping(value = "/test2", method = {RequestMethod.GET})
    public String create2() {
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        String s = "不测试demo5啊啊啊啊啊啊啊啊啊啊啊,时间是："+format;
        return s;
    }


}
