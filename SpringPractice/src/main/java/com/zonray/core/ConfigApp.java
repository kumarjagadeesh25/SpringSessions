package com.zonray.core;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class ConfigApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
//		ClassPathResource resource = new ClassPathResource("beans.xml");
//		reader.loadBeanDefinitions(resource);
		FileSystemResource resource = new FileSystemResource("E:\\beans.xml");
		reader.loadBeanDefinitions(resource);
		Person person = container.getBean("person2",Person.class);
		person.display();
		System.out.println(person);
		
		
	}

}
