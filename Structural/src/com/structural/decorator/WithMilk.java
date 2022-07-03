package com.structural.decorator;

public class WithMilk extends CoffeeDecorator {

	public WithMilk(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.5;
	}
	
	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", Milk";
	}
}
