package com.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {
	private final Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee c) {
		this.decoratedCoffee = c;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getCost();
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return decoratedCoffee.getIngredients();
	}
}
