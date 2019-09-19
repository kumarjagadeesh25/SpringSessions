package com.zonray.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonUsingAnnotationContainerApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext container = 
				new AnnotationConfigApplicationContext(PersonUsingAnnotationContainer.class);
		PersonUsingAnnotationContainer person = container.getBean(PersonUsingAnnotationContainer.class);
		System.out.println(person);
		AnnotationConfigApplicationContext.class.cast(container).close();
	}
}
 