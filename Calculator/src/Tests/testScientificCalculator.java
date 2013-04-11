package Tests;

import static org.junit.Assert.*;
import ie.gcd.maths.ScientificCalculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class testScientificCalculator {

	public testScientificCalculator() {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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

}
