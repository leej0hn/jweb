package com.redscraf.jweb.server.controller;

import com.redscraf.jweb.feign.TestDemoApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用接口方式进行接口编写
 * @author oKong
 *
 */
@RestController
@Slf4j
public class TestDemoApiImpl implements TestDemoApi {
	
	@Override
	public String demoTest() {
		log.info("[spring-cloud-eureka-client]服务[demoTest]被调用");
		return   " demoTest被 调用 !";
	}
}
