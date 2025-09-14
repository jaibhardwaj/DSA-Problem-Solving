package com.jai.stack_queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueToStackAdapterPopEfficientTest
{

	@Test
	public void testPushAndSizeAndTop()
	{
		QueueToStackAdapterPopEfficient stack = new QueueToStackAdapterPopEfficient();
		assertEquals(0, stack.size());

		stack.push(10);
		assertEquals(1, stack.size());
		assertEquals(10, stack.top());

		stack.push(20);
		assertEquals(2, stack.size());
		assertEquals(20, stack.top());

		stack.push(30);
		assertEquals(3, stack.size());
		assertEquals(30, stack.top());
	}

	@Test
	public void testPopAndOrder()
	{
		QueueToStackAdapterPopEfficient stack = new QueueToStackAdapterPopEfficient();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(0, stack.size());
	}

	@Test
	public void testUnderflowPopAndTop()
	{
		QueueToStackAdapterPopEfficient stack = new QueueToStackAdapterPopEfficient();
		// When empty, pop and top return -1 per implementation
		assertEquals(-1, stack.pop());
		assertEquals(-1, stack.top());

		// After pushing and popping all elements, behavior should be same
		stack.push(5);
		assertEquals(5, stack.pop());
		assertEquals(-1, stack.pop());
		assertEquals(-1, stack.top());
	}
}

