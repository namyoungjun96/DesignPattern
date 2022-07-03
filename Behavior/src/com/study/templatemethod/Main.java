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
 * 장점
 * 1. 중복 코드를 줄일 수 있다.
 * 2. 자식 클래스의 역할을 줄여 핵심 로직의 관리가 용이하다.
 * 3. 좀 더 코드를 객체지향적으로 구성할 수 있다.
 * 
 * 단점
 * 1. 추상 메소드가 많아지면서 클래스 관리가 복잡해진다.
 * 2. 클래스간의 관계와 코드가 꼬여버릴 염려가 있다.
 * 
 * 사용하기 좋은 상황
 * 1. 상위 클래스는 작업의 전체 흐름을 구현한다. 즉, 상위 클래스가 흐름 제어의 주체가 된다. 상위클래스가 주체가 되는 경우
 * 2. 서비스별로 중복이 되고, 중복이 절대 바뀌지 않는 경우
 */