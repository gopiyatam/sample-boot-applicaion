package com.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.boot")

public class SampleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
