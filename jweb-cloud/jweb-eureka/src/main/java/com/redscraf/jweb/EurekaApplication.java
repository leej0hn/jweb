package com.redscraf.jweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务端
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication  implements CommandLineRunner {

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("{} boot successfully", this.appName);
	}
}
