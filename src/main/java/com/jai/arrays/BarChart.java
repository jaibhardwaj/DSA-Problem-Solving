package com.jai.arrays;

public class BarChart
{
	public static void main(String[] args)
	{
		bar(new int[]{3, 1, 2, 7, 5});
	}

	/**
	 * this function is to create and print a bar chart of a given array
	 * @param arr array
	 */
	public static void bar(int[] arr)
	{
		int max = arr[0];

		for( int i = 1; i < arr.length; i++ )
		{
			if( arr[i] > max )
			{
				max = arr[i];
			}
		}

		for( int floor = max; floor > 0; floor-- )
		{
			for( int b : arr )
			{
				if( b >= floor )
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}
}
