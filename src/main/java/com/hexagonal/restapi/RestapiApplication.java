package com.hexagonal.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories()
public class RestapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
}
