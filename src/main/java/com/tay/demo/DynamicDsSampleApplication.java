package com.tay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tay.dynamicds.EnableDynamicDS;

@SpringBootApplication
@EnableDynamicDS
public class DynamicDsSampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(DynamicDsSampleApplication.class, args);
	}
}

