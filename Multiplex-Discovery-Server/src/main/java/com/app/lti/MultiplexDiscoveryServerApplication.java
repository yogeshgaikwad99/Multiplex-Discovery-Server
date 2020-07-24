package com.app.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MultiplexDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexDiscoveryServerApplication.class, args);
	}

}
