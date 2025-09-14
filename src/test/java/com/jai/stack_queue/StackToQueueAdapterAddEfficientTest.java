package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackToQueueAdapterAddEfficientTest
{

	@Test
	void testEmptyQueueBehavior()
	{
		StackToQueueAdapterAddEfficient queue = new StackToQueueAdapterAddEfficient();
		assertEquals(0, queue.size());
		assertEquals(-1, queue.peek());
		assertEquals(-1, queue.remove());
	}

	@Test
	void testAddAndPeek()
	{
		StackToQueueAdapterAddEfficient queue = new StackToQueueAdapterAddEfficient();

		queue.add(10);
		assertEquals(1, queue.size());
		assertEquals(10, queue.peek());

		queue.add(20);
		assertEquals(2, queue.size());
		assertEquals(10, queue.peek()); // FIFO - should still see first element

		queue.add(30);
		assertEquals(3, queue.size());
		assertEquals(10, queue.peek()); // FIFO - should still see first element
	}

	@Test
	void testRemoveOrder()
	{
		StackToQueueAdapterAddEfficient queue = new StackToQueueAdapterAddEfficient();

		queue.add(100);
		queue.add(200);
		queue.add(300);

		assertEquals(100, queue.remove()); // FIFO - first in first out
		assertEquals(2, queue.size());
		assertEquals(200, queue.peek());

		assertEquals(200, queue.remove());
		assertEquals(1, queue.size());
		assertEquals(300, queue.peek());

		assertEquals(300, queue.remove());
		assertEquals(0, queue.size());
		assertEquals(-1, queue.peek()); // Empty again
	}

	@Test
	void testMixedOperations()
	{
		StackToQueueAdapterAddEfficient queue = new StackToQueueAdapterAddEfficient();

		queue.add(10);
		assertEquals(10, queue.peek());
		assertEquals(10, queue.remove());

		queue.add(20);
		queue.add(30);
		assertEquals(20, queue.remove());

		queue.add(40);
		assertEquals(30, queue.peek());
		assertEquals(30, queue.remove());
		assertEquals(40, queue.remove());

		assertEquals(-1, queue.peek());
		assertEquals(-1, queue.remove());
	}
}
