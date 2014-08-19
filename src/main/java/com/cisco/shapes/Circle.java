package com.cisco.shapes;

public class Circle implements Shape {
	
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}

}
