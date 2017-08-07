package com.javarticles.spring.integration.serviceactivator;

import java.util.concurrent.Future;

public class GreetingImpl implements Greeting {	
	
	public  String sayHello(String payload){
		  System.out.println("Service  czeka ...");

//		  try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		return "Hello World!" + payload;
	}

	@Override
	public void sayHelloNoReturn(String payload) {
		  System.out.println(payload + "start service activator...");
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} 
		  System.out.println(payload + "   " + "Koniec Service  nic nie zwroci zakonczyl sie ...");

		
	}
	
	
	
}