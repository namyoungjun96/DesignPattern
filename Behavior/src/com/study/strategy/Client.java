package com.study.strategy;

public class Client {
	public static void main(String[] args) {
		Moving bus = new Bus();
		bus.move();
		
		Moving train = new Train();
		train.move();
		
		train.setStrategy(new LoadStrategy());
		train.move();
	}
}
