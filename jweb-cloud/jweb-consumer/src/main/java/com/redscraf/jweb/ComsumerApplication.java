package com.redscraf.jweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@EnableFeignClients(basePackages = {"com.redscraf.jweb.feign"})
public class ComsumerApplication implements CommandLineRunner {
	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ComsumerApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("{} boot successfully", this.appName);
	}

}
