package com.study.templatemethod;

public class Main {
	public static void main(String[] args) {
		Store burgerking = new Burgerking();
		Store mcdonald = new Mcdonald();
		
		burgerking.giveFood();
		System.out.println("------------------------------");
		mcdonald.giveFood();
	}
}




/*
 * ����
 * 1. �ߺ� �ڵ带 ���� �� �ִ�.
 * 2. �ڽ� Ŭ������ ������ �ٿ� �ٽ� ������ ������ �����ϴ�.
 * 3. �� �� �ڵ带 ��ü���������� ������ �� �ִ�.
 * 
 * ����
 * 1. �߻� �޼ҵ尡 �������鼭 Ŭ���� ������ ����������.
 * 2. Ŭ�������� ����� �ڵ尡 �������� ������ �ִ�.
 * 
 * ����ϱ� ���� ��Ȳ
 * 1. ���� Ŭ������ �۾��� ��ü �帧�� �����Ѵ�. ��, ���� Ŭ������ �帧 ������ ��ü�� �ȴ�. ����Ŭ������ ��ü�� �Ǵ� ���
 * 2. ���񽺺��� �ߺ��� �ǰ�, �ߺ��� ���� �ٲ��� �ʴ� ���
 */