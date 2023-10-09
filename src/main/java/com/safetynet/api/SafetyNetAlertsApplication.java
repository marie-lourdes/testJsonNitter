package com.safetynet.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SafetyNetAlertsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafetyNetAlertsApplication.class, args);
		
	}
	@Bean
	UploadDataFileRunner uploadDataRunner() {
		return  new UploadDataFileRunner ();
	}
}
