package com.ecommerce.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Service discovery server to connect all the micro-services in the Ecommerce system
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApplication {

	/**
	 * Main application to boot up server
	 * @param args runtime params
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryApplication.class, args);
	}

}
