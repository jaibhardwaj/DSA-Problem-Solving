package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for MyStack class.
 */
class MyStackTest
{

	@Test
	void testPushAndPop()
	{
		MyStack stack = new MyStack(2);
		assertTrue(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		assertEquals(2, stack.size());
		assertEquals(20, stack.top());
		assertEquals(20, stack.pop());
		assertEquals(1, stack.size());
		assertEquals(10, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void testUnderflow()
	{
		MyStack stack = new MyStack(2);
		assertEquals(-1, stack.pop());
		assertEquals(-1, stack.top());
	}

	@Test
	void testDynamicResizing()
	{
		MyStack stack = new MyStack(2);
		stack.push(1);
		stack.push(2);
		stack.push(3); // Should trigger resize
		stack.display();
		assertEquals(3, stack.size());
		assertEquals(3, stack.top());
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertTrue(stack.isEmpty());
	}

	@Test
	void testLIFOOrder()
	{
		MyStack stack = new MyStack(5);
		for( int i = 1; i <= 5; i++ )
		{
			stack.push(i);
		}
		for( int i = 5; i >= 1; i-- )
		{
			assertEquals(i, stack.pop());
		}
		assertTrue(stack.isEmpty());
	}
}

