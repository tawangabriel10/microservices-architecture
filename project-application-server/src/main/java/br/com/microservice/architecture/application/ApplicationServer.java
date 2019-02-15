package br.com.microservice.architecture.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationServer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer.class, args);
	}

}

