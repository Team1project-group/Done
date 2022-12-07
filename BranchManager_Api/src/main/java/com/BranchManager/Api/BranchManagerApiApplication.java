package com.BranchManager.Api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class BranchManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BranchManagerApiApplication.class, args);
	}

}
