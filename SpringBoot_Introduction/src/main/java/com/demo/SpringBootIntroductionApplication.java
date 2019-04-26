package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.demo.beans")
public class SpringBootIntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroductionApplication.class, args);
	}

}
