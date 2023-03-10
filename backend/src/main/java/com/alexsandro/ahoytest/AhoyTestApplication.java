package com.alexsandro.ahoytest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "2.0", description = "Employees Information"))
public class AhoyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AhoyTestApplication.class, args);
	}

}
