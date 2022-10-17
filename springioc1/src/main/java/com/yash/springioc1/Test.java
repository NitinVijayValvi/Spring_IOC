package com.yash.springioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Movie movie = (Movie) applicationContext.getBean("movie1");

		// movie.show();
		
		City city = (City) applicationContext.getBean("city1");
	
		//System.out.println(city.toString());
	//System.out.println("-----------------------------------------");
		city.display();
		
		City city2 = (City) applicationContext.getBean("city2");
		city2.display();
	}
}
