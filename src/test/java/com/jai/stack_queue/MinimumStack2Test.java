package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumStack2Test
{

	@Test
	void testUnderflowBehavior()
	{
		MinimumStack2 st = new MinimumStack2();
		assertEquals(-1, st.pop(), "pop on empty should return -1");
		assertEquals(-1, st.peek(), "peek on empty should return -1");
	}

	@Test
	void testPushPeekPopSequence()
	{
		MinimumStack2 st = new MinimumStack2();

		st.push(5);
		assertEquals(5, st.peek());

		st.push(2);
		assertEquals(2, st.peek());

		st.push(2);
		assertEquals(2, st.peek());

		st.push(3);
		assertEquals(3, st.peek());

		assertEquals(3, st.pop()); // remove 3
		assertEquals(2, st.pop()); // remove one 2
		assertEquals(2, st.pop()); // remove second 2
		assertEquals(5, st.pop()); // remove 5
		assertEquals(-1, st.pop()); // now empty
	}

	@Test
	void testEncodedMinRecovery()
	{
		MinimumStack2 st = new MinimumStack2();

		st.push(10);
		st.push(5);
		st.push(2);
		st.push(1);

		assertEquals(1, st.pop());
		assertEquals(2, st.pop());
		assertEquals(5, st.pop());
		assertEquals(10, st.pop());
		assertEquals(-1, st.pop());
	}
}

