package com.jai.stack_queue;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackToQueueAdapterRemoveEfficientTest
{

	@Test
	public void testAddPeekAndSize()
	{
		StackToQueueAdapterRemoveEfficient q = new StackToQueueAdapterRemoveEfficient();
		assertEquals(0, q.size());

		q.add(10);
		assertEquals(1, q.size());
		assertEquals(10, q.peek());

		q.add(20);
		assertEquals(2, q.size());
		// peek should still be the first added element (FIFO)
		assertEquals(10, q.peek());

		q.add(30);
		assertEquals(3, q.size());
		assertEquals(10, q.peek());
	}

	@Test
	public void testRemoveOrderAndSize()
	{
		StackToQueueAdapterRemoveEfficient q = new StackToQueueAdapterRemoveEfficient();
		q.add(1);
		q.add(2);
		q.add(3);

		assertEquals(1, q.remove());
		assertEquals(2, q.remove());
		assertEquals(3, q.remove());
		assertEquals(0, q.size());
	}

	@Test
	public void testUnderflowRemoveAndPeek()
	{
		StackToQueueAdapterRemoveEfficient q = new StackToQueueAdapterRemoveEfficient();
		assertEquals(-1, q.remove());
		assertEquals(-1, q.peek());

		q.add(5);
		assertEquals(5, q.remove());
		assertEquals(-1, q.remove());
		assertEquals(-1, q.peek());
	}

	@Test
	public void testInterleavedOperations()
	{
		StackToQueueAdapterRemoveEfficient q = new StackToQueueAdapterRemoveEfficient();
		q.add(100);
		assertEquals(100, q.remove());

		q.add(200);
		q.add(300);
		assertEquals(200, q.remove());
		q.add(400);
		assertEquals(300, q.remove());
		assertEquals(400, q.remove());
	}
}

