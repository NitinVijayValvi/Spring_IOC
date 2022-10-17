package com.yash.springioc4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext apiContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SetterMessage setterMessage = (SetterMessage) apiContext.getBean("settermessage");
		
		setterMessage.display();
	}
}
