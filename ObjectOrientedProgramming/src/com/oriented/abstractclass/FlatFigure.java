package com.oriented.abstractclass;

public abstract class FlatFigure extends Figure {
	@Override
	protected Coordinate returnCoordinate() {
		Coordinate coordinate = new Coordinate();
		coordinate.setX(10);
		coordinate.setY(15);
		
		return coordinate;
	}
	
	public abstract int returnArea(int width, int height);
}
