package com.demo.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class JavaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaServiceApplication.class, args);
	}
}
