package com.jai.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Power class, including all power calculation methods.
 */
public class PowerTest
{

	/**
	 * Test powerUsingLinear with various cases.
	 */
	@Test
	void testPowerUsingLinear()
	{
		assertEquals(8, Power.powerUsingLinear(2, 3));
		assertEquals(1, Power.powerUsingLinear(5, 0));
		assertEquals(27, Power.powerUsingLinear(3, 3));
		assertEquals(0, Power.powerUsingLinear(0, 5));
		assertEquals(1, Power.powerUsingLinear(0, 0)); // 0^0 is often defined as 1 in programming
	}

	/**
	 * Test powerUsingRecursion with various cases.
	 */
	@Test
	void testPowerUsingRecursion()
	{
		assertEquals(8, Power.powerUsingRecursion(2, 3));
		assertEquals(1, Power.powerUsingRecursion(5, 0));
		assertEquals(27, Power.powerUsingRecursion(3, 3));
		assertEquals(0, Power.powerUsingRecursion(0, 5));
		assertEquals(1, Power.powerUsingRecursion(0, 0));
	}

	/**
	 * Test powerUsingLogarithmic with various cases.
	 */
	@Test
	void testPowerUsingLogarithmic()
	{
		assertEquals(8, Power.powerUsingLogarithmic(2, 3));
		assertEquals(1, Power.powerUsingLogarithmic(5, 0));
		assertEquals(27, Power.powerUsingLogarithmic(3, 3));
		assertEquals(0, Power.powerUsingLogarithmic(0, 5));
		assertEquals(1, Power.powerUsingLogarithmic(0, 0));
		assertEquals(16, Power.powerUsingLogarithmic(2, 4));
		assertEquals(32, Power.powerUsingLogarithmic(2, 5));
	}
}

