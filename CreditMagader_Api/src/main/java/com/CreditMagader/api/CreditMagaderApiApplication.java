package com.CreditMagader.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class CreditMagaderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditMagaderApiApplication.class, args);
	}

}
