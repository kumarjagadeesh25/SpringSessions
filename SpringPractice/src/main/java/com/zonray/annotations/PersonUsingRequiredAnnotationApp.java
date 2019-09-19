package com.zonray.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonUsingRequiredAnnotationApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-config-annotation.xml");
		PersonUsingRequiredAnnotation personObject = container.getBean(PersonUsingRequiredAnnotation.class);
		System.out.println(personObject);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}
}
