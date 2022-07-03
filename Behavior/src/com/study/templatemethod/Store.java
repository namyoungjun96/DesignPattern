package com.study.templatemethod;

public abstract class Store {
	public void giveFood() {
		order();
		choice();
		returnPayment();
		goodBye();
	}
	
	protected void order() {
		System.out.println("�ֹ� �մϴ�.");
	}
	
	protected void goodBye() {
		System.out.println("�ȳ��� �輼��.");
	}
	
	protected abstract void choice();
	protected abstract void returnPayment(); 
}
