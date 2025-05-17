package com.jai.arrays;

public class SubArraysOfAnArray
{
	public static void main(String[] args)
	{
		subArray(new int[]{1, 2, 3, 4});
	}

	public static void subArray(int[] arr)
	{
		for( int i = 0; i < arr.length; i++ )
		{
			for( int j = i; j < arr.length; j++ )
			{
				for( int k = i; k <= j; k++ )
				{
					System.out.print(arr[k] + "\t");
				}
				System.out.println();
			}
		}
	}
}
