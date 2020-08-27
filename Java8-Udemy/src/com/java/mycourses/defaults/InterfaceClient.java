package com.java.mycourses.defaults;

public class InterfaceClient implements Interface1, Interface2, Interface3 {
	
	public void methodA() {
		System.out.println("Inside Method A " + InterfaceClient.class);
	}
	
	public static void main(String[] args) {
		InterfaceClient client = new InterfaceClient();
		client.methodA();
		client.methodB();
		client.methodC();
	}
}
