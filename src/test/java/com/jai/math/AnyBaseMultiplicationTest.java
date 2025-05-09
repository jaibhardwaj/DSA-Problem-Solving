package com.jai.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnyBaseMultiplicationTest
{

	@Test
	void multiplication()
	{
		final int number1 = AnyBaseMultiplication.multiplication(2156, 74, 8);
		assertEquals(204710, number1);
	}
}