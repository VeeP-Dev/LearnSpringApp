package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBootBookappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookappApplication.class, args);
	}
	
	@Autowired
	IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Get all books");
		System.out.println(bookService.getAll()); 
		
		System.out.println("Get book by id");
		System.out.println(bookService.getById(1));
		
		System.out.println("Get book by Auhtor");
		System.out.println(bookService.getByAuthor("Kathy"));
		
	
	}

}
