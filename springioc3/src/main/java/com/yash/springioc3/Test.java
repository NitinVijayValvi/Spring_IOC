package com.yash.springioc3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ConstructorMessage constructorMessage = (ConstructorMessage) applicationContext.getBean("constructormessage");
	
		constructorMessage.display();
		
	}
}
