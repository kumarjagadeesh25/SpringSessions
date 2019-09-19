package com.zonray.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ScopeApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("com/zonray/config/spring-config.xml");
	
		Person person = container.getBean(Person.class);
		System.out.println(person);
		
		Person person2 = container.getBean(Person.class);
		System.out.println(person2);
		Person person3 = container.getBean(Person.class);
		System.out.println(person3);
		Person person4 = container.getBean(Person.class);
		System.out.println(person4);
		
	}

}
