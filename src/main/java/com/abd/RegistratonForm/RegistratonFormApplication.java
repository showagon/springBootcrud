package com.abd.RegistratonForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.abd.RegistratonForm")
@EntityScan("com.abd.model")
public class RegistratonFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistratonFormApplication.class, args);
	}

}
