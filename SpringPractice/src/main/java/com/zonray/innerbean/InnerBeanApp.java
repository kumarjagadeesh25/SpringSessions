package com.zonray.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring-bean.xml");
		Person person = container.getBean(Person.class);
		System.out.println(person);
		ClassPathXmlApplicationContext.class.cast(container).close();
		
	}
}
