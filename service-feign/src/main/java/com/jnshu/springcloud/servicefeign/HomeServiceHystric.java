package com.jnshu.springcloud.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author : baiyunzhong
 * @date : 2019/10/22  0:16
 * @description:
 */
@Component
public class HomeServiceHystric implements HomeService {
    @Override
    public String sayHiFromFeign(String name) {
        return "Sorry"+name+"服务挂了！";
    }
}
