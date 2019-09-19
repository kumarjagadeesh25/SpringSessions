package com.zonray.ownlifecycles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonwWthOwnLifeCycleMethodsForMandatoryPropertiesApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-bean-ownlifecycle.xml");
		PersonwWthOwnLifeCycleMethodsForMandatoryProperties personObject = container.getBean(PersonwWthOwnLifeCycleMethodsForMandatoryProperties.class);
		System.out.println(personObject);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}

}
