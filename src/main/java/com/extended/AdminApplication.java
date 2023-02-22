package com.extended;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplication {
	private static final Logger logger = LoggerFactory.getLogger(AdminApplication.class);

	public static void main(String[] args) {
		logger.info("AdminApplication:: Running");
		SpringApplication.run(AdminApplication.class, args);
	}

}
