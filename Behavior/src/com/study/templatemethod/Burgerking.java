package com.study.templatemethod;

public class Burgerking extends Store {
	@Override
	protected void choice() {
		// TODO Auto-generated method stub
		System.out.println("���۸� ���ϴ�");			// something choice logic
	}

	@Override
	protected void returnPayment() {
		// TODO Auto-generated method stub
		System.out.println("6000�� �Դϴ�.");			// something payment calculator logic
	}
}
