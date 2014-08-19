package com.cisco.shapes;

public class Rectangle implements Shape {
	
	double width;
	double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

	@Override
	public double calculatePerimeter() {
		return 2*width*height;
	}

}
