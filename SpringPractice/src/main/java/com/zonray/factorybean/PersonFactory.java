package com.zonray.factorybean;

public class PersonFactory {
	
	public PersonFactory() {
		System.out.println("PersonFactory object created..");
	}
	public  Person createPerson() {
		Person person = new Person();
		return person;
	}
}
