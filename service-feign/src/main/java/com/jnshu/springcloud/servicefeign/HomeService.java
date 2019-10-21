package com.jnshu.springcloud.servicefeign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : baiyunzhong
 * @date : 2019/10/21  19:19
 * @description:
 */
@FeignClient(value = "eureka-client",fallback = HomeServiceHystric.class)
public interface HomeService {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    String sayHiFromFeign(@RequestParam("name") String name);
}
