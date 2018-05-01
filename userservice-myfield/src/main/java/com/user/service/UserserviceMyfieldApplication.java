package com.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserserviceMyfieldApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceMyfieldApplication.class, args);
	}
}
