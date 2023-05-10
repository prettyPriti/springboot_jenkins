package com.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class SpringbbootJenkinApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringbbootJenkinApplication.class);

	@PostConstruct
	public void intt()
	{
		logger.info("Application started...");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbbootJenkinApplication.class, args);
		logger.info("Application executed");
	}

}
