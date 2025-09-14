package com.jai.stack_queue;

import java.util.Queue;

public class QueueToStackAdapterPushEfficient
{
	private java.util.Queue<Integer> mainQ;
	private java.util.Queue<Integer> helperQ;

	public QueueToStackAdapterPushEfficient()
	{
		mainQ = new java.util.ArrayDeque<>();
		helperQ = new java.util.ArrayDeque<>();
	}

	public int size()
	{
		return mainQ.size();
	}

	public void push(int val)
	{
		mainQ.add(val);
	}

	public int pop()
	{
		if( mainQ.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		while( mainQ.size() > 1 )
		{
			helperQ.add(mainQ.remove());
		}

		int top = mainQ.remove();

		Queue<Integer> temp = mainQ;
		mainQ = helperQ;
		helperQ = temp;

		return top;
	}

	public int top()
	{
		if( mainQ.isEmpty() )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		while( mainQ.size() > 1 )
		{
			helperQ.add(mainQ.remove());
		}

		int top = mainQ.remove();
		helperQ.add(top);

		Queue<Integer> temp = mainQ;
		mainQ = helperQ;
		helperQ = temp;

		return top;
	}
}
