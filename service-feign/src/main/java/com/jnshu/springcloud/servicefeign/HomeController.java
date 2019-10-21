package com.jnshu.springcloud.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : baiyunzhong
 * @date : 2019/10/21  19:29
 * @description:
 */
@RestController
public class HomeController {
    @Autowired
    HomeService homeService;
    @GetMapping("/home")
    public String sayHi(@RequestParam String name){
        return homeService.sayHiFromFeign(name);
    }
}
