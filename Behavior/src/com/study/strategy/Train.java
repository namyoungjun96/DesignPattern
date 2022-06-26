package com.study.strategy;

public class Train extends Moving {

	public Train() {
		super(new RailLoadStrategy());
	}
}
