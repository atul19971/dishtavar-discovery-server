package com.dishtavar.cloud.dishtavardiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DishtavarDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DishtavarDiscoveryServerApplication.class, args);
		
	}
}
