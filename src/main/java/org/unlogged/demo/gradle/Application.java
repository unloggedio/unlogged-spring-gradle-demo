package org.unlogged.demo.gradle;

import io.unlogged.Unlogged;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Unlogged
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
