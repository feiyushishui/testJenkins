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
        String s = "demo6,11111111111111时间是："+format;
        return s;
    }

    @RequestMapping(value = "/test2", method = {RequestMethod.GET})
    public String create2() {
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        String s = "demo6,22222222222222时间是："+format;
        return s;
    }

    @RequestMapping(value = "/test3", method = {RequestMethod.GET})
    public String create3() {
        Date date = new Date();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        String s = "demo6,33333333333333333时间是："+format;
        return s;
    }

}
