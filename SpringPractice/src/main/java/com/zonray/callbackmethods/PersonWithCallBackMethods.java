package com.zonray.callbackmethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonWithCallBackMethods implements InitializingBean,DisposableBean {

	private Integer pid;
	private String name;
	private String address;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if(pid==null) {
			throw new Exception("PID is Missing");
		}
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("this is Destroy mehtod");
	}

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonWithCallBackMethods [pid=" + pid + ", name=" + name + ", address=" + address + "]";
	}
	

	
}
