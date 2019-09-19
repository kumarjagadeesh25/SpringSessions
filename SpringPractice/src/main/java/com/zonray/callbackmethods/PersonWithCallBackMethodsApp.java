package com.zonray.callbackmethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonWithCallBackMethodsApp {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("spring-bean-callbackmethods.xml");
		PersonWithCallBackMethods personObject = container.getBean(PersonWithCallBackMethods.class);
		System.out.println(personObject);		
		ClassPathXmlApplicationContext.class.cast(container).close();
		
	}
}
