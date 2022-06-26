package com.study.strategy;

public abstract class Moving {
	private MoveableStrategy strategy;
	
	public Moving(MoveableStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void move() {
		strategy.move();
	}
	
	public void setStrategy(MoveableStrategy strategyType) {
		this.strategy = strategyType;
	}
}
