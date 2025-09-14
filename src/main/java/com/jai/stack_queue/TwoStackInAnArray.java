package com.jai.stack_queue;

public class TwoStackInAnArray
{
	private final int[] data;
	private int tos1;
	private int tos2;

	public TwoStackInAnArray(int cap)
	{
		data = new int[cap];
		tos1 = -1;
		tos2 = data.length;
	}

	public int size1()
	{
		return tos1 + 1;
	}

	public int size2()
	{
		return data.length - tos2;
	}

	public void push1(int val)
	{
		if( tos2 - tos1 == 1 )
		{
			System.out.println("Stack overflow!");
			return;
		}

		tos1++;
		data[tos1] = val;
	}

	public void push2(int val)
	{
		if( tos2 - tos1 == 1 )
		{
			System.out.println("Stack overflow!");
			return;
		}

		tos2--;
		data[tos2] = val;
	}

	public int pop1()
	{
		if( tos1 == -1 )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		int val = data[tos1];
		tos1--;
		return val;
	}

	public int pop2()
	{
		if( tos2 == data.length )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		int val = data[tos2];
		tos2++;
		return val;
	}

	public int top1()
	{
		if( tos1 == -1 )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		return data[tos1];
	}

	public int top2()
	{
		if( tos2 == data.length )
		{
			System.out.println("Stack underflow!");
			return -1;
		}

		return data[tos2];
	}
}
