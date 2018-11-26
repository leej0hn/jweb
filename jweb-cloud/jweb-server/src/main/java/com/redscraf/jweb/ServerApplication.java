package com.redscraf.jweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者示例-eureka客户端
 */
@SpringBootApplication
//注意这里也可使用@EnableEurekaClient
//但由于springcloud是灵活的，注册中心支持eureka、consul、zookeeper等
//若写了具体的注册中心注解，则当替换成其他注册中心时，又需要替换成对应的注解了。
//所以 直接使用@EnableDiscoveryClient 启动发现。
//这样在替换注册中心时，只需要替换相关依赖即可。
@EnableDiscoveryClient
@Slf4j
public class ServerApplication implements CommandLineRunner {
	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("{} boot successfully", this.appName);
	}

}
