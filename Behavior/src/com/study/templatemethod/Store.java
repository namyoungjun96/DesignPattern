package com.study.templatemethod;

public abstract class Store {
	public void giveFood() {
		order();
		choice();
		returnPayment();
		goodBye();
	}
	
	protected void order() {
		System.out.println("주문 합니다.");
	}
	
	protected void goodBye() {
		System.out.println("안녕히 계세요.");
	}
	
	protected abstract void choice();
	protected abstract void returnPayment(); 
}
