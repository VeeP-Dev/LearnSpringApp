package com.example.services;

import org.springframework.stereotype.Service;

@Service
public interface IGreeterService {
	public String greetUser(String username);
}
