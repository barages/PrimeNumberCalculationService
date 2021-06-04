package com.example.prime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class PrimeNumberCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumberCalculationServiceApplication.class, args);
	}

}
