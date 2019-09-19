package com.zonray.multipleconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleConfigFilesApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/zonray/config/spring-config-multiple-person.xml");
		Person person = container.getBean(Person.class);
		Address address = container.getBean(Address.class);
		System.out.println(person);
		System.out.println(address);
		ClassPathXmlApplicationContext.class.cast(container).close();
		}
}


