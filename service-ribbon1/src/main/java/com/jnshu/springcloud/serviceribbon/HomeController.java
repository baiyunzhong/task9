package com.jnshu.springcloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : baiyunzhong
 * @date : 2019/10/21  10:19
 * @description:
 */
@RestController
public class HomeController {
    @Autowired
    HomeService homeService;
    @RequestMapping("/home")
    public String home(@RequestParam String name){
        return "web2"+homeService.homeServicr(name);
    }
}
