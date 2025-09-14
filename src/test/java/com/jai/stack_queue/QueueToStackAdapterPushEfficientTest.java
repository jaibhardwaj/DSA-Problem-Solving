package com.jai.stack_queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueToStackAdapterPushEfficientTest
{

	@Test
	public void testPushAndSizeAndTop()
	{
		QueueToStackAdapterPushEfficient stack = new QueueToStackAdapterPushEfficient();
		assertEquals(0, stack.size());

		stack.push(100);
		assertEquals(1, stack.size());
		assertEquals(100, stack.top());

		stack.push(200);
		assertEquals(2, stack.size());
		assertEquals(200, stack.top());

		stack.push(300);
		assertEquals(3, stack.size());
		assertEquals(300, stack.top());
	}

	@Test
	public void testPopAndOrder()
	{
		QueueToStackAdapterPushEfficient stack = new QueueToStackAdapterPushEfficient();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(0, stack.size());
	}

	@Test
	public void testTopDoesNotRemove()
	{
		QueueToStackAdapterPushEfficient stack = new QueueToStackAdapterPushEfficient();
		stack.push(7);
		stack.push(8);
		int t = stack.top();
		assertEquals(8, t);
		// top should not remove the element
		assertEquals(2, stack.size());
		assertEquals(8, stack.top());
	}

	@Test
	public void testUnderflowPopAndTop()
	{
		QueueToStackAdapterPushEfficient stack = new QueueToStackAdapterPushEfficient();
		assertEquals(-1, stack.pop());
		assertEquals(-1, stack.top());

		stack.push(5);
		assertEquals(5, stack.pop());
		assertEquals(-1, stack.pop());
		assertEquals(-1, stack.top());
	}
}

