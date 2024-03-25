package com.learning.realProjectProblems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealProjectProblemsApplication {
	private static final Logger logger = LogManager.getLogger(RealProjectProblemsApplication.class);


	public static void main(String[] args) {
		logger.info("Log4j configuration file: {}", System.getProperty("log4j2.configurationFile"));
		logger.fatal("Springbok application starting .....");
		SpringApplication.run(RealProjectProblemsApplication.class, args);
	}

}
