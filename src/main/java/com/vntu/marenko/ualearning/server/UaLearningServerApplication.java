package com.vntu.marenko.ualearning.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class UaLearningServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UaLearningServerApplication.class, args);
	}

}
