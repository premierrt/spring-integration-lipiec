package com.javarticles.spring.integration;

import java.util.concurrent.Future;

public interface Greeting{
	public String sayHello(String payload);
	
	public void sayHelloNoReturn(String payload);

}
