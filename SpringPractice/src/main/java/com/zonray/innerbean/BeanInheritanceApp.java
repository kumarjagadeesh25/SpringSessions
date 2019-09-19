package com.zonray.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean.xml");
		Student student1 = (Student) applicationContext.getBean("anil");
		Student student2 = (Student) applicationContext.getBean("sunil");
		System.out.println(student1+"\n"+student2);
		ClassPathXmlApplicationContext.class.cast(applicationContext).close();
	}
}
