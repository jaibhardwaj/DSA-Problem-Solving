package com.jai.stack_queue;

/**
 * A simple integer stack implementation with dynamic resizing.
 */
public class MyStack
{
	private int[] arr;
	private int top = -1;

	/**
	 * Constructs a stack with the given initial capacity.
	 *
	 * @param capacity initial stack capacity
	 */
	public MyStack(int capacity)
	{
		arr = new int[capacity];
	}

	/**
	 * Returns the number of elements in the stack.
	 *
	 * @return stack size
	 */
	public int size()
	{
		return top + 1;
	}

	/**
	 * Displays the stack from top to bottom.
	 */
	public void display()
	{
		int i = top;
		while(i >= 0)
		{
			System.out.print(arr[i] + " ");
			i--;
		}
	}

	/**
	 * Checks if the stack is empty.
	 *
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty()
	{
		return top == -1;
	}

	/**
	 * Pushes a value onto the stack, resizing if needed.
	 *
	 * @param val value to push
	 */
	public void push(int val)
	{
		if( top == arr.length - 1 )
		{ // Check if stack is full
			int newCap = arr.length * 2;
			int[] arr2 = new int[newCap];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
		arr[++top] = val;
	}

	/**
	 * Pops the top value from the stack.
	 *
	 * @return the popped value, or -1 if stack is empty
	 */
	public int pop()
	{
		if( isEmpty() )
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top--];
	}

	/**
	 * Returns the top value without removing it.
	 *
	 * @return the top value, or -1 if stack is empty
	 */
	public int top()
	{
		if( isEmpty() )
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		return arr[top];
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("[");
		for( int i = top; i >= 0; i-- )
		{
			sb.append(arr[i]);
			if( i > 0 )
			{
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
