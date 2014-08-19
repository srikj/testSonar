package com.cisco.shapes;

/**
 * @author srikj
 * Square implementation
 */
public class Square implements Shape {
	
	double side; // Length of a side
	
	Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	@Override
	public double calculateArea() {
		return side*side;
	}

	@Override
	public double calculatePerimeter() {
		return 4*side;
	}

}
