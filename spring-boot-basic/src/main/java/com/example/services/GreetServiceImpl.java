package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreetServiceImpl implements IGreeterService {

	@Override
	public String greetUser(String username) {
		return "Have a great Day" + username;
	}
	
}
