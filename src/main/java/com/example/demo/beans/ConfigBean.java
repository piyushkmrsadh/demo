package com.example.demo.beans;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
	
	@Bean
	public TestB b() {
		return new TestB();
	}
	
	@Bean
	public TestA a(TestB b) {
		return new TestA(b);
	}

}
