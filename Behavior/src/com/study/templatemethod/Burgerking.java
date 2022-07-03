package com.study.templatemethod;

public class Burgerking extends Store {
	@Override
	protected void choice() {
		// TODO Auto-generated method stub
		System.out.println("와퍼를 고릅니다");			// something choice logic
	}

	@Override
	protected void returnPayment() {
		// TODO Auto-generated method stub
		System.out.println("6000원 입니다.");			// something payment calculator logic
	}
}
