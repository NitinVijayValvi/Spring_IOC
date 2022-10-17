package com.yash.springioc6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

	System.out.println("Four wheelers \n");
	Vehicle vehicle = (Vehicle)applicationContext.getBean("vehicle1");
	vehicle.display();
	
	Vehicle vehicle2 = (Vehicle)applicationContext.getBean("vehicle2");
	vehicle2.display();
	System.out.println();
	System.out.println("Two wheelers \n");
	
	Vehicle vehicle3 = (Vehicle)applicationContext.getBean("vehicle3");
	vehicle3.display();

}
}
