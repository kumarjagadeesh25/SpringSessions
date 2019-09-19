package com.zonray.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathConfigApp {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("com/zonray/config/spring-config.xml");
		System.out.println(container.containsBean("address"));
		String[] names = container.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}
		
		ClassPathXmlApplicationContext.class.cast(container).close();
	}

}
