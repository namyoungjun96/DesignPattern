package com.oriented.abstractclass;

public class Client {
	public static void main(String[] args) {
		FlatFigure circle = new Circle();
		Coordinate coordinate = new Coordinate();
		coordinate = circle.returnCoordinate();
		
		System.out.println(circle.returnArea(10, 12));
		System.out.println("x ÁÂÇ¥´Â " + coordinate.getX() + " y ÁÂÇ¥´Â " + coordinate.getY());
	}
}
