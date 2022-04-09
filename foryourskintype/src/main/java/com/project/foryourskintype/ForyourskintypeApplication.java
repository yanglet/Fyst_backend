package com.project.foryourskintype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ForyourskintypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForyourskintypeApplication.class, args);
	}

}
