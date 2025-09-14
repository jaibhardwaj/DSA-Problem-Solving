package com.jai.stack_queue;

public class StackToQueueAdapterRemoveEfficient
{
	private final java.util.Stack<Integer> mainS;
	private final java.util.Stack<Integer> helperS;

	public StackToQueueAdapterRemoveEfficient()
	{
		mainS = new java.util.Stack<>();
		helperS = new java.util.Stack<>();
	}

	public int size()
	{
		return mainS.size();
	}

	public void add(int val)
	{
		while(!mainS.isEmpty())
		{
			helperS.push(mainS.pop());
		}

		mainS.push(val);

		while(!helperS.isEmpty())
		{
			mainS.push(helperS.pop());
		}
	}

	public int remove()
	{
		if( mainS.isEmpty() )
		{
			System.out.println("Queue underflow!");
			return -1;
		}

		return mainS.pop();
	}

	public int peek()
	{
		if( mainS.isEmpty() )
		{
			System.out.println("Queue underflow!");
			return -1;
		}

		return mainS.peek();
	}
}
