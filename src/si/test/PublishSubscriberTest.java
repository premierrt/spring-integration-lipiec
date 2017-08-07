package si.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javarticles.spring.integration.GreetingGateway;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("../../applicationContext.xml")
public class PublishSubscriberTest {

	@Autowired
	GreetingGateway greetingGateway;
	
	
	@Test
	public void testSendGreeting(){
		for (int i=0; i< 10; i++){ 
			greetingGateway.sendGreeting("to jest testowy tekst");
		}
		System.out.println("koniec testow");
	}
	
	

}
