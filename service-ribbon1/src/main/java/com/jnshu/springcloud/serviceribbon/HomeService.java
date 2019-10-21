package com.jnshu.springcloud.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : baiyunzhong
 * @date : 2019/10/21  10:17
 * @description:
 */
@Service
public class HomeService {
    @Autowired
    RestTemplate restTemplate;

    public String homeServicr(String name){
        return restTemplate.getForObject("http://eureka-client/home?name="+name,String.class);
    }
}
