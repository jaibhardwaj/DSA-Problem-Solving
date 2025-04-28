package com.jai.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyBaseToAnyBaseTest
{

	@Test
	void anyBaseToAnyBase()
	{
		final int number1 = AnyBaseToAnyBase.anyBaseToAnyBase(172, 8, 2);
		assertEquals(1111010, number1);
	}
}