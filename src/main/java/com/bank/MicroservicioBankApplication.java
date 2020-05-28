package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioBankApplication.class, args);
	}

}
