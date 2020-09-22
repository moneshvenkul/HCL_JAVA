package com.abstractimpl;

import com.abstractclasses.Shape;

public class Square extends Shape {
	float side;

	public Square(String name, float side) {
		super(name);
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public float calculateArea() {
		float areaOfSquare = side * side;
		return areaOfSquare;
	}
}
