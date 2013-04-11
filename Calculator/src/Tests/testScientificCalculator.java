package Tests;

import static org.junit.Assert.*;
import ie.gcd.maths.ScientificCalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testScientificCalculator {

	public testScientificCalculator() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		ScientificCalculator sc = new ScientificCalculator();
		assertEquals("Test add",3, sc.add(2, 1));
	}
	
	@Test
	public void testSubtract() {
		ScientificCalculator sc = new ScientificCalculator();
		assertEquals("Test subtact",1, sc.subtract(2, 1));
	}
	
	@Test
	public void testMultiply() {
		ScientificCalculator sc = new ScientificCalculator();
		assertEquals("Test multiply",20, sc.multiply(4, 5));
	}
	
	@Test
	public void testDivide() {
		ScientificCalculator sc = new ScientificCalculator();
		assertEquals("Test divide",10, sc.divide(20, 2));
	}
	
	

}
