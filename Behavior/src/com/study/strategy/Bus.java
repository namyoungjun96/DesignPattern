package com.study.strategy;

public class Bus extends Moving {

	public Bus() {
		super(new LoadStrategy());
	}
}
