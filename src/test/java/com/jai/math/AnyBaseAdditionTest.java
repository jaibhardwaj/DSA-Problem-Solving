package com.jai.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyBaseAdditionTest
{

	@Test
	void add()
	{
		final int number1 = AnyBaseAddition.add(767, 421, 8);
		assertEquals(1410, number1);

		final int number2 = AnyBaseAddition.add(236, 754, 8);
		assertEquals(1212, number2);
	}
}