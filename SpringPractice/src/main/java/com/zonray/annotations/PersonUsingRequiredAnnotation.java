package com.zonray.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonUsingRequiredAnnotation {

	private Integer pid;
	@Value(value = "Sanju")
	private String name;

	public PersonUsingRequiredAnnotation() {
		System.out.println("Cunstructor executed..");
	}
	public Integer getPid() {
		return pid;
	}
	@Required
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PersonUsingRequiredAnnotation [pid=" + pid + ", name=" + name + "]";
	}
	
	
}
