package com.zonray.extra;

public class App {

	public static void main(String[] args) {
		MyInterface myInterface = new Cone();
		myInterface.demo();
		myInterface.methodOne();
		
		((Cone)myInterface).methodTwo();
		Cone.class.cast(myInterface).methodTwo();
		
	}
}
