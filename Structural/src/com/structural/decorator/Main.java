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
	����
	1. ���� �ڵ带 �������� �ʰ� ���ڷ����� ������ ���� �ൿ�� Ȯ���ų �� �ֽ��ϴ�.
	2. ������ ������ ���ؼ� �����߿� ���ο� �ൿ�� �߰��� �� �ֽ��ϴ�.
	
	����
	1. �ǹ̾��� ��ü���� �ʹ� ���� �߰��� �� �ֽ��ϴ�.
	2. ���ڷ����͸� �ʹ� ���� ����ϸ� �ڵ尡 �ʿ� �̻����� �������� �� �ֽ��ϴ�.
	
	����ϱ� ���� ��Ȳ
	1. Ŭ������ ��ҵ��� ����ؼ� ������ �ϸ鼭 ����ϴ� ������ �ʿ��� ���
	2. ���� ��ҵ��� �����ؼ� ����ϴ� Ŭ���� ������ ���
*/