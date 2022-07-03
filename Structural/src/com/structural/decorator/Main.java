package com.structural.decorator;

public class Main {
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		printinfo(c);
		
		c = new WithMilk(c);
		printinfo(c);
		
		c = new WithSprinkles(c);
		printinfo(c);
	}
	
	protected static void printinfo(Coffee c) {
		System.out.println("Cost: " + c.getCost() + ", Ingredients: " + c.getIngredients());
	}
}



/*
	장점
	1. 기존 코드를 수정하지 않고도 데코레이터 패턴을 통해 행동을 확장시킬 수 있습니다.
	2. 구성과 위임을 통해서 실행중에 새로운 행동을 추가할 수 있습니다.
	
	단점
	1. 의미없는 객체들이 너무 많이 추가될 수 있습니다.
	2. 데코레이터를 너무 많이 사용하면 코드가 필요 이상으로 복잡해질 수 있습니다.
	
	사용하기 좋은 상황
	1. 클래스의 요소들을 계속해서 수정을 하면서 사용하는 구조가 필요한 경우
	2. 여러 요소들을 조합해서 사용하는 클래스 구조인 경우
*/