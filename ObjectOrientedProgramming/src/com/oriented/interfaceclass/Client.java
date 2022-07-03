package com.oriented.interfaceclass;

public class Client {
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.value);
		System.out.println(parent.getValue());
	}
}
