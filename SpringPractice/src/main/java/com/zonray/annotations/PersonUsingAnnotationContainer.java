package com.zonray.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class PersonUsingAnnotationContainer {
	
	@Value(value = "1")
	private Integer pid;
	@Value(value = "Sanju")
	private String name;
	
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
		return "PersonUsingAnnotationContainer [pid=" + pid + ", name=" + name + "]";
	}
	
	
}
