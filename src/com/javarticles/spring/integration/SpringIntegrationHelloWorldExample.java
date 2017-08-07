package com.javarticles.spring.integration;
 
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
 
public class SpringIntegrationHelloWorldExample {
    private MessageChannel inChannel;
 
    public static void main(String[] args) {
       
    	//testWersjBasicSpringIntegration();
    	testWersjAsynchronicznaSpringIntegration();
        
    }
 
    
    
    
    public static void testWersjaPublishSubsribeSpringIntegration(){
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        /**
         * gateway laczy interface wywolywane z kanelem. 
         */
        GreetingGateway greetingGateway= (GreetingGateway)context.getBean("greetingGateway");
//        Future< String> greetingFuture = greetingGateway.sayHello("World");
//        		
//        String greetingText;
//		try {
//			greetingText = greetingFuture.get();
//	        System.out.println(greetingText);
//
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        		
        		
        
        System.out.println("Test metody ktora nic nie zwraca");
       for (int i=0; i<5; i++){
        	greetingGateway.sayHelloNoReturn("to jest wywolanie numer: "+i);
        }
        System.out.println("Koniec programu glownego. Test metody ktora nic nie zwraca");
   }
   
    
    
    
    
    
    

    public static void testWersjBasicSpringIntegration(){
    	
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                 "applicationContext.xml");

         /**
          * gateway laczy interface wywolywane z kanelem. 
          */
         GreetingGateway greetingGateway= (GreetingGateway)context.getBean("greetingGateway");
         Future< String> greetingFuture = greetingGateway.sayHello("World");
         		
         String greetingText;
 		try {
 			greetingText = greetingFuture.get();
 	        System.out.println(greetingText);

 		} catch (InterruptedException | ExecutionException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
         
         		
         		
         System.out.println("Synchroniczna metoda zwrocia cos");
         
         System.out.println("Test metody ktora nic nie zwraca");
         greetingGateway.sayHelloNoReturn("dupa ");
         System.out.println("Koniec programu glownego. Test metody ktora nic nie zwraca");
    }
    
    
    
    
    
    public static void testWersjAsynchronicznaSpringIntegration(){
    	
   	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        /**
         * gateway laczy interface wywolywane z kanelem. 
         */
        GreetingGateway greetingGateway= (GreetingGateway)context.getBean("greetingGateway");
//        Future< String> greetingFuture = greetingGateway.sayHello("World");
//        		
//        String greetingText;
//		try {
//			greetingText = greetingFuture.get();
//	        System.out.println(greetingText);
//
//		} catch (InterruptedException | ExecutionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        		
        		
        
        System.out.println("Test metody ktora nic nie zwraca");
       for (int i=0; i<5; i++){
        	greetingGateway.sayHelloNoReturn("to jest wywolanie numer: "+i);
        }
        System.out.println("Koniec programu glownego. Test metody ktora nic nie zwraca");
   }
   
    
}