package com.redscraf.jweb.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单api示例
 * @author oKong
 *
 */
@RestController
@Slf4j
public class DemoController {

	@GetMapping("/hello")
	public String index(String name) {
		log.info("[spring-cloud-eureka-client]服务被调用，参数name值为：{}", name);
		return name + ",this is spring-cloud-eureka-client!";
	}	
}
