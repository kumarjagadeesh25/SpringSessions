package com.zonray.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
		reader.loadBeanDefinitions("com/zonray/config/beans.xml");
//		Person person = (Person) container.getBean("person");
		Person person = container.getBean(Person.class);
//		Person person2 = container.getBean("person", Person.class);
		Employee employee = container.getBean(Employee.class);
		System.out.println(employee);
		System.out.println(person);
	}

}







