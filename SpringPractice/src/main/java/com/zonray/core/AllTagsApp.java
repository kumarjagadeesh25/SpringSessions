package com.zonray.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AllTagsApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("com/zonray/config/spring-config-tags.xml");
		PersonTags personTags = container.getBean("srinu",PersonTags.class);
		System.out.println(personTags);
		ClassPathXmlApplicationContext.class.cast(container).close();		
	}
}
