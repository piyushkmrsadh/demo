package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestA {
	
	@Autowired
	private TestB b;
	
	public TestA(TestB b) {
		this.b = b;
		// TODO Auto-generated constructor stub
	}
	

}
