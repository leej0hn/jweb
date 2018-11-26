package com.redscraf.jweb.feign;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/10/18
 * <p>Version: 1.0
 */
@FeignClient(name = "jweb-eureka-server")
@RequestMapping("/api")
public interface TestDemoApi {

    @HystrixCommand(commandKey = "test")
    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    String demoTest();
}
