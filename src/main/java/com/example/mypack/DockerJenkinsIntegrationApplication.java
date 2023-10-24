package com.example.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntegrationApplication {
	
	
	public static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationApplication.class);
	
	public static void main(String[] args) {
		logger.info("<---------Inside main method--------------------->");
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
		logger.info("<--------Main method completed------------------->");
	}
	
	
	@GetMapping(path = "/welcome")
	public String welComeMessage() {
		logger.info("<---------Inside welComeMessage method--------------------->");
		return "Welcome first docker jenkins integration";
	}

}
