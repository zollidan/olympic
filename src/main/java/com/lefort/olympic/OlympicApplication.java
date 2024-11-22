package com.lefort.olympic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OlympicApplication {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(OlympicApplication.class, args);
	}

}
