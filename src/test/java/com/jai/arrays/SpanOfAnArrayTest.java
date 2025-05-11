package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpanOfAnArrayTest
{

	@Test
	void span()
	{
		int span1 = SpanOfAnArray.span(new int[]{});
		assertEquals(-1, span1);

		int span2 = SpanOfAnArray.span(new int[]{15, 30, 40, 4, 11, 9});
		assertEquals(36, span2);

		int span3 = SpanOfAnArray.span(new int[]{11, 9});
		assertEquals(2, span3);

		int span4 = SpanOfAnArray.span(new int[]{11});
		assertEquals(11, span4);
	}
}