package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.services.IGreeterService;

@SpringBootApplication
public class SpringBootBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	
	private IGreeterService greeterService;
	
	@Autowired
	public void setGreeterService(IGreeterService greeterService) {
		this.greeterService = greeterService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(greeterService.greetUser("VeeDev"));
	}

}
