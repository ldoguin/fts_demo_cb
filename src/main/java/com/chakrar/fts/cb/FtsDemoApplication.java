package com.chakrar.fts.cb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FtsDemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(FtsDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FtsDemoApplication.class, args);
		log.info(" Running FtsDemoApplication ...");
	}
}
