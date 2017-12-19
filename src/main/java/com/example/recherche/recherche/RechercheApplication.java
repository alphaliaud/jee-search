package com.example.recherche.recherche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RechercheApplication {

	public static void main(String[] args) {
		SpringApplication.run(RechercheApplication.class, args);
	}
}
