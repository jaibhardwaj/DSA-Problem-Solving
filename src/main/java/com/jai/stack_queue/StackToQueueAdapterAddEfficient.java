package com.jai.stack_queue;

import java.util.Stack;

public class StackToQueueAdapterAddEfficient
{
	private final Stack<Integer> mainS;
	private final Stack<Integer> helperS;

	public StackToQueueAdapterAddEfficient()
	{
		mainS = new Stack<>();
		helperS = new Stack<>();
	}

	public int size()
	{
		return mainS.size();
	}

	public void add(int val)
	{
		mainS.push(val);
	}

	public int remove()
	{
		if( mainS.isEmpty() )
		{
			System.out.println("Queue underflow!");
			return -1;
		}

		while(!mainS.isEmpty())
		{
			helperS.push(mainS.pop());
		}

		int front = helperS.pop();

		while(!helperS.isEmpty())
		{
			mainS.push(helperS.pop());
		}

		return front;
	}

	public int peek()
	{
		if( mainS.isEmpty() )
		{
			System.out.println("Queue underflow!");
			return -1;
		}

		while(!mainS.isEmpty())
		{
			helperS.push(mainS.pop());
		}

		int front = helperS.peek();

		while(!helperS.isEmpty())
		{
			mainS.push(helperS.pop());
		}

		return front;
	}
}
