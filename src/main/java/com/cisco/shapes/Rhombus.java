package com.cisco.shapes;

public class Rhombus implements Shape {
	
	private enum Method {DIAG, HEIGHT, TRIG};
	
	double d1;
	double d2;
	double base;
	double height;
	double acuteAngle;
	Method method;
	
	public void initWithDiagonals(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
		this.method = Method.DIAG;
	}
	
	public void initWithBaseAndHeight(double base, double height) {
		this.base = base;
		this.height = height;
		this.method = Method.HEIGHT;
	}
	
	public void initWithBaseAndAngle(double base, double angle) {
		this.base = base;
		this.acuteAngle = Math.toRadians(angle);
		this.method = Method.TRIG;
	}

	@Override
	public double calculateArea() {
		
		double area = 0;
		
		switch(this.method) {
			case DIAG:	area = 0.5*d1*d2;
						break;
			case HEIGHT:area = 0.5*base*height;
						break;
			case TRIG: 	area = Math.ceil(base*base*Math.sin(acuteAngle));
						break;
			default:	area = -1;
						break;
		}
		return area;
	}

	@Override
	public double calculatePerimeter() {
		
		double perimeter = 0;
		
		switch(this.method) {
			case DIAG:	perimeter = 2*Math.sqrt(d1*d1+d2*d2);
					break;
			case HEIGHT:perimeter = 4*base;
					break;
			case TRIG: 	perimeter = 4*base;
					break;
			default:	perimeter = -1;
					break;
		
		}
		
		return perimeter;
	}

}
