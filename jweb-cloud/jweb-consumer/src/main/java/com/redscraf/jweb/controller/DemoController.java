package com.redscraf.jweb.controller;

import com.redscraf.jweb.feign.TestDemoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * feign 示例
 * @author OKong
 *
 */
@RestController
@Slf4j
public class DemoController {

	@Autowired
	TestDemoApi api;
	
	@GetMapping("/hello")
    public String hello(String name) {
    	log.info("使用feign调用服务，参数name:{}", name);
        return api.demoTest();
    } 
	
}
