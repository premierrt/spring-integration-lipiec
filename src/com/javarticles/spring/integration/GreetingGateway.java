package com.javarticles.spring.integration;

import java.util.concurrent.Future;

public interface GreetingGateway {
	public  Future<String> sayHello(String payload);
	public void sayHelloNoReturn(String payload);
}
