package com.jai.stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackAdapterPopEfficient
{
	private final Queue<Integer> mainQ;
	private final Queue<Integer> helperQ;

	public QueueToStackAdapterPopEfficient()
	{
		mainQ = new ArrayDeque<>();
		helperQ = new ArrayDeque<>();
	}

	public int size()
	{
		return mainQ.size();
	}

	public void push(int val)
	{
		while(!mainQ.isEmpty())
		{
			helperQ.add(mainQ.remove());
		}

		mainQ.add(val);

		while(!helperQ.isEmpty())
		{
			mainQ.add(helperQ.remove());
		}
	}

	public int pop()
	{
		if( mainQ.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		return mainQ.remove();
	}

	public int top()
	{
		if( mainQ.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		return mainQ.peek();
	}
}
