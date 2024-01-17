package org.unlogged.demo.gradle;

import io.unlogged.Unlogged;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@Configuration
public class Application {

	@Unlogged
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
