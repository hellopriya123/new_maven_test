package com.bosch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class TestNG {

	private Maths classundertest;	

	@Before
	public void setUp() throws Exception {

	classundertest = new Maths();

	}
	
	@After
	public void after()
	{
	System.out.println("After execution")
	}
	
	@Test
	public void testAdd() {
		//comment-3 : fail("Not yet implemented");

	long result = 10+2;
	assertEquals(result, classundertest.add(10,2)); 

	}

	@Test
	public void testSubtract() {
	//comment-5: fail("Not yet implemented");
	long result = 10-2;
	assertEquals(result, classundertest.subtract(10,2));

	}
	@Test
	public void testSubtract() {
	//comment-5: fail("Not yet implemented");
	long result = 8-3;
	assertEquals(result, classundertest.subtract(8,3));

}
}
