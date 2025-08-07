package com.REST_services.callingEndpointsUsingOpenFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CallingEndpointsUsingOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallingEndpointsUsingOpenFeignApplication.class, args);
	}

}
