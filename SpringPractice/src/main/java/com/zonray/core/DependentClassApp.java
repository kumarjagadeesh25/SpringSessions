package com.zonray.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependentClassApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/zonray/config/spring-bean-dependent.xml");
		Person1 person1 = container.getBean(Person1.class);
		System.out.println(person1);
		ClassPathXmlApplicationContext.class.cast(container).close();
		
	}
}


