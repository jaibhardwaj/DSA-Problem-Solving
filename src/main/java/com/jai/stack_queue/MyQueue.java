package com.jai.stack_queue;

public class MyQueue
{
	private int front = 0;
	private int size = 0;
	private int[] arr;

	public MyQueue(int capacity)
	{
		arr = new int[capacity];
	}

	public void add(int element)
	{
		if( size == arr.length )
		{
			int[] newData = new int[size * 2];
			for( int i = 0; i < size; i++ )
			{
				int id = (front + i) % arr.length;
				newData[i] = arr[id];
			}
			front = 0;
			arr = newData;
		}

		int rear = (front + size) % arr.length;
		arr[rear] = element;
		size++;
	}

	public int peek()
	{
		if( size == 0 )
		{
			System.out.println("Queue underflow!");
			return -1;
		}

		return arr[front];
	}

	public int remove()
	{
		if( size == 0 )
		{
			System.out.println("Queue underflow!");
			return -1;
		}

		int val = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return val;
	}

	public int size()
	{
		return size;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("MyQueue [ ");

		for( int i = 0; i < size; i++ )
		{
			int id = (front + i) % arr.length;
			builder.append(arr[id]);
			if( i > 0 )
			{
				builder.append(", ");
			}
		}

		builder.append("]");

		return builder.toString();
	}
}
