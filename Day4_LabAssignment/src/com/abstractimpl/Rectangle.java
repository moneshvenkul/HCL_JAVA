package com.abstractimpl;

import com.abstractclasses.Shape;

public class Rectangle extends Shape {

	private float length;
	private float breadth;

	public Rectangle(String name, float length, float breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;

	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public float calculateArea() {
		float areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}

}
