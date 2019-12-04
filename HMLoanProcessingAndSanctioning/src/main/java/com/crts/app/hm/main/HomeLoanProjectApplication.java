package com.crts.app.hm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HomeLoanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanProjectApplication.class, args);
	}

}
