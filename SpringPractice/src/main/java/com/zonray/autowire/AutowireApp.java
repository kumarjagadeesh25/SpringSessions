package com.zonray.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApp {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-bean-autowire.xml");
		Person person = container.getBean(Person.class);
		Person2 person1 = container.getBean(Person2.class);
		System.out.println(person);
		System.out.println(person1);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}
}
