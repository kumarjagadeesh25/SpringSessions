package com.zonray.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class DependencyInjectionApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("com/zonray/config/spring-config.xml");
		Person person = container.getBean(Person.class);
		System.out.println(person);
	}

}
