package com.redscraf.jweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul-进阶 自定义过滤器、异常处理等
 * 
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Slf4j
public class ZuulApplication implements CommandLineRunner {

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) throws Exception {
		
	 	SpringApplication.run(ZuulApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("{} boot successfully", this.appName);
	}
}
