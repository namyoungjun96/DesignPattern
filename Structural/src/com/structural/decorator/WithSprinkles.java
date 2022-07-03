package com.structural.decorator;

public class WithSprinkles extends CoffeeDecorator {

	public WithSprinkles(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.2;
	}
	
	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", Sprinkles";
	}
}
