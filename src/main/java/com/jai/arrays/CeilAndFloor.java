package com.jai.arrays;

public class CeilAndFloor
{
	public static void main(String[] args)
	{
		ceilAndFloor(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 5);
	}
	public static void ceilAndFloor(int[] arr, int num)
	{
		int low = 0;
		int high = arr.length - 1;
		int ceil = 0;
		int floor = 0;

		while( low <= high )
		{
			int mid = (low + high) / 2;

			if(num == arr[mid])
			{
				ceil = arr[mid];
				floor = arr[mid];
				break;
			}
			else if( num < arr[mid] )
			{
				high = mid - 1;
				ceil = arr[mid];
			}
			else
			{
				low = mid + 1;
				floor = arr[mid];
			}
		}

		System.out.println(ceil);
		System.out.println(floor);
	}
}
