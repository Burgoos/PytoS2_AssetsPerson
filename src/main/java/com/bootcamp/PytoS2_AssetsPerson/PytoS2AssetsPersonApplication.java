package com.bootcamp.PytoS2_AssetsPerson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PytoS2AssetsPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PytoS2AssetsPersonApplication.class, args);
	}

}
