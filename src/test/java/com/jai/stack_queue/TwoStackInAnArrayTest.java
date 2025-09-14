package com.jai.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStackInAnArrayTest
{

	@Test
	void testInitialState()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(5);
		assertEquals(0, stacks.size1());
		assertEquals(0, stacks.size2());
		assertEquals(-1, stacks.top1());
		assertEquals(-1, stacks.top2());
	}

	@Test
	void testPushAndTopStack1()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(5);

		stacks.push1(10);
		assertEquals(1, stacks.size1());
		assertEquals(10, stacks.top1());

		stacks.push1(20);
		assertEquals(2, stacks.size1());
		assertEquals(20, stacks.top1());
	}

	@Test
	void testPushAndTopStack2()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(5);

		stacks.push2(100);
		assertEquals(1, stacks.size2());
		assertEquals(100, stacks.top2());

		stacks.push2(200);
		assertEquals(2, stacks.size2());
		assertEquals(200, stacks.top2());
	}

	@Test
	void testPopStack1()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(5);

		stacks.push1(10);
		stacks.push1(20);
		stacks.push1(30);

		assertEquals(30, stacks.pop1());
		assertEquals(2, stacks.size1());
		assertEquals(20, stacks.pop1());
		assertEquals(10, stacks.pop1());
		assertEquals(0, stacks.size1());
		assertEquals(-1, stacks.pop1()); // Underflow
	}

	@Test
	void testPopStack2()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(5);

		stacks.push2(100);
		stacks.push2(200);
		stacks.push2(300);

		assertEquals(300, stacks.pop2());
		assertEquals(2, stacks.size2());
		assertEquals(200, stacks.pop2());
		assertEquals(100, stacks.pop2());
		assertEquals(0, stacks.size2());
		assertEquals(-1, stacks.pop2()); // Underflow
	}

	@Test
	void testStacksIndependence()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(6);

		stacks.push1(10);
		stacks.push2(100);
		stacks.push1(20);
		stacks.push2(200);

		assertEquals(2, stacks.size1());
		assertEquals(2, stacks.size2());
		assertEquals(20, stacks.top1());
		assertEquals(200, stacks.top2());
	}

	@Test
	void testOverflow()
	{
		TwoStackInAnArray stacks = new TwoStackInAnArray(4);

		// Fill both stacks until they meet
		stacks.push1(1);
		stacks.push1(2);
		stacks.push2(3);
		stacks.push2(4);

		// Try to overflow
		stacks.push1(5); // Should print overflow message
		stacks.push2(6); // Should print overflow message

		// Verify state hasn't changed
		assertEquals(2, stacks.size1());
		assertEquals(2, stacks.size2());
		assertEquals(2, stacks.top1());
		assertEquals(4, stacks.top2());
	}
}
