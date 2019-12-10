package com.crts.app.hm.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/*import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
*/import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@EnableDiscoveryClient*/
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class HmMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmMasterServiceApplication.class, args);
		
	}

	@Bean
	public Logger logger() {
		Logger logger=LogManager.getLogger();
		return logger;
	}
}
