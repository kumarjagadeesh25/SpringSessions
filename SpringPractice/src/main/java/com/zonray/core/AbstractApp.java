package com.zonray.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/zonray/config/spring-config-abstract.xml");
		PersonAbstract personAbstract = container.getBean(PersonAbstract.class);
		System.out.println(personAbstract);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}

}
