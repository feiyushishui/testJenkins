package com.tencent.gaio.workorder.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test", method = {RequestMethod.GET})
    public String create() {
        return "demo4部署之后成功进入的页面";
    }


}
