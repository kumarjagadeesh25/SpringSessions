package com.zonray.multiplecontainers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext parentcontainer = new ClassPathXmlApplicationContext("com/zonray/config/parent-bean.xml");
		ClassPathXmlApplicationContext childcontainer = new ClassPathXmlApplicationContext(new String[] {"com/zonray/config/child-bean.xml"}, parentcontainer);
		Person person = childcontainer.getBean(Person.class);
		Address address = childcontainer.getBean(Address.class);
		
		System.out.println(person);
		System.out.println(address);
		ClassPathXmlApplicationContext.class.cast(childcontainer).close();
		ClassPathXmlApplicationContext.class.cast(parentcontainer).close();
	}
}
