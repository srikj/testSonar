package com.cisco.shapes.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cisco.shapes.Rhombus;

public class RhombusTest {

	@Test
	public void rhombusAreaWithBaseAndHeight() {
		Rhombus r = new Rhombus();
		r.initWithBaseAndHeight(10, 7);
		Assert.assertEquals(r.calculateArea(), 35.0);
	}
	
	@Test
	public void rhombusAreaWithDiagonals() {
		Rhombus r = new Rhombus();
		r.initWithDiagonals(8, 6);
		Assert.assertEquals(r.calculateArea(), 24.0);
	}
	
	@Test
	public void rhombusAreaWithBaseAndAngle() {
		Rhombus r = new Rhombus();
		r.initWithBaseAndAngle(10, 30);
		Assert.assertEquals(r.calculateArea(), 50.0);
	}
}
