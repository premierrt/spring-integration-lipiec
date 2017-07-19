package com.javarticles.spring.integration;
 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
 
public class SpringIntegrationHelloWorldExample {
    private MessageChannel inChannel;
 
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        /**
         * gateway laczy interface wywolywane z kanelem. 
         */
        Greeting greetingGateway= (Greeting)context.getBean("greetingGateway");
        		System.out.println(greetingGateway.sayHello("World"));
        
    }
 

}