package com.jai.stack_queue;

import java.util.Stack;

public class MinimumStack2
{
	private final Stack<Integer> data;
	private int min;

	public MinimumStack2()
	{
		data = new Stack<>();
		min = Integer.MAX_VALUE;
	}

	public void push(int val)
	{
		if( data.isEmpty() )
		{
			data.push(val);
			min = val;
		}
		else if( val >= min )
		{
			data.push(val);
		}
		else
		{
			int encodedVal = 2 * val - min;
			data.push(encodedVal);
			min = val;
		}
	}

	public int pop()
	{
		if( data.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		int top = data.pop();
		if( top >= min )
		{
			return top;
		}
		else
		{
			int originalMin = min;
			min = 2 * min - top;
			return originalMin;
		}
	}

	public int peek()
	{
		if( data.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		int top = data.peek();
		if( top >= min )
		{
			return top;
		}
		else
		{
			return min;
		}
	}

}
