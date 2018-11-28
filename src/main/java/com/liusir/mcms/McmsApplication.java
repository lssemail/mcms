package com.liusir.mcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class McmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(McmsApplication.class, args);
	}
}
