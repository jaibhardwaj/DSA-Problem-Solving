package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for MyQueue class.
 */
class MyQueueTest
{

	@Test
	void testAddPeekRemoveAndUnderflow()
	{
		MyQueue q = new MyQueue(2);
		assertEquals(0, q.size());

		q.add(10);
		q.add(20);
		assertEquals(2, q.size());
		assertEquals(10, q.peek());

		assertEquals(10, q.remove());
		assertEquals(1, q.size());
		assertEquals(20, q.peek());

		assertEquals(20, q.remove());
		assertEquals(0, q.size());

		// underflow
		assertEquals(-1, q.remove());
		assertEquals(-1, q.peek());
	}

	@Test
	void testDynamicResizingAndOrder()
	{
		MyQueue q = new MyQueue(2);
		q.add(1);
		q.add(2);
		q.add(3); // should resize
		q.add(4);

		assertEquals(4, q.size());

		assertEquals(1, q.remove());
		assertEquals(2, q.remove());
		assertEquals(3, q.remove());
		assertEquals(4, q.remove());
		assertEquals(0, q.size());
	}

	@Test
	void testWrapAroundBehavior()
	{
		MyQueue q = new MyQueue(3);
		q.add(1);
		q.add(2);
		q.add(3);

		assertEquals(1, q.remove());
		assertEquals(2, q.remove());

		// now front moved; adding should wrap
		q.add(4);
		q.add(5);

		assertEquals(3, q.remove());
		assertEquals(4, q.remove());
		assertEquals(5, q.remove());
	}
}

