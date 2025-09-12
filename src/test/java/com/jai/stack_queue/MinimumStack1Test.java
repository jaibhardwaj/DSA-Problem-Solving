package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumStack1Test
{

	@Test
	void testPushAndMinAndSize()
	{
		MinimumStack1 st = new MinimumStack1();
		assertEquals(0, st.size());

		st.push(5);
		assertEquals(1, st.size());
		assertEquals(5, st.top());
		assertEquals(5, st.min());

		st.push(2);
		st.push(2);
		st.push(3);
		assertEquals(4, st.size());
		assertEquals(3, st.top());
		assertEquals(2, st.min());
	}

	@Test
	void testPopAndMinWithDuplicateMins()
	{
		MinimumStack1 st = new MinimumStack1();
		st.push(5);
		st.push(2);
		st.push(2);
		st.push(3);

		assertEquals(3, st.pop()); // remove 3
		assertEquals(2, st.min());

		assertEquals(2, st.pop()); // remove one 2
		assertEquals(2, st.min()); // still 2 because duplicate

		assertEquals(2, st.pop()); // remove second 2
		assertEquals(5, st.min()); // now min is 5

		assertEquals(5, st.pop());
		assertEquals(0, st.size());
	}

	@Test
	void testUnderflowBehavior()
	{
		MinimumStack1 st = new MinimumStack1();

		assertEquals(-1, st.pop());
		assertEquals(-1, st.top());
		assertEquals(-1, st.min());
		assertEquals(0, st.size());
	}
}

