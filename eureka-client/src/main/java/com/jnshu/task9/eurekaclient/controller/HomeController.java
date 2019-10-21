package com.jnshu.task9.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : baiyunzhong
 * @date : 2019/10/21  0:29
 * @description:
 */
@RestController
public class HomeController {
    //获取yml文件中的sever.port属性
    @Value("${server.port}")
    String port;
    @GetMapping("home")
    public String home(@RequestParam(value = "name",defaultValue="BYZ")String name){
        return "hi!" + name +"!!我是来自"+port+"端口的" ;
    }

}
