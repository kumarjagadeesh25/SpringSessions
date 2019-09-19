package com.zonray.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		Person person = container.getBean(Person.class);
		System.out.println(person);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}
}
