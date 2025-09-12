package com.jai.stack_queue;

import java.util.Stack;

public class MinimumStack1
{
	private final Stack<Integer> allData;
	private final Stack<Integer> minData;

	public MinimumStack1()
	{
		allData = new Stack<>();
		minData = new Stack<>();
	}

	public void push(int val)
	{
		allData.push(val);

		if( minData.isEmpty() || val <= minData.peek() )
		{
			minData.push(val);
		}
	}

	public int pop()
	{
		if( allData.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		int val = allData.pop();
		if( val == minData.peek() )
		{
			minData.pop();
		}

		return val;
	}

	public int top()
	{
		if( allData.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		return allData.peek();
	}

	public int min()
	{
		if( minData.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		return minData.peek();
	}

	public int size()
	{
		return allData.size();
	}
}
