package com.javarticles.spring.integration;

public class GreetingImpl implements Greeting {	
	
	public String sayHello(String payload){
		return "Hello World!" + payload;
	}
}