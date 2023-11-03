package com.hamlet.DreamProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration

public class DreamProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamProjectApplication.class, args);
	}

}
