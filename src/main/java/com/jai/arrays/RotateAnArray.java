package com.jai.arrays;

public class RotateAnArray
{
	public static int[] rotate1(int[] arr, int k)
	{
		if( arr == null || arr.length == 0 )
		{
			return null;
		}

		if( arr.length == 1 || k == 0 || k == arr.length)
		{
			return arr;
		}

		int n = arr.length;

		k = k % n;
		if( k < 0 )
		{
			k = n + k;
		}

		while(k >= 1)
		{
			int val = arr[n - 1];

			for( int i = n - 2; i >= 0; i-- )
			{
				arr[i + 1] = arr[i];
			}

			arr[0] = val;
			k--;
		}

		return arr;
	}

	/**
	 * this function first reverses < k part, then reverse > k part,
	 * then reverse all the array
	 * @param arr array
	 * @param k amount of rotation
	 * @return rotated an array
	 */
	public static int[] rotate2(int[] arr, int k)
	{
		if( arr == null || arr.length == 0 )
		{
			return null;
		}

		if( arr.length == 1 || k == 0 || k == arr.length)
		{
			return arr;
		}

		int n = arr.length;

		k = k % n;
		if( k < 0 )
		{
			k = n + k;
		}

		// part 1 reverse
		reverse(arr, 0, n - k - 1);

		// part 2 reverse
		reverse(arr, n - k, n - 1);

		// All reverse
		reverse(arr, 0, n - 1);

		return arr;
	}

	public static void reverse(int[] arr, int i, int j)
	{
		if( arr == null || arr.length == 0 )
		{
			return;
		}

		if( arr.length == 1 )
		{
			return;
		}

		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}

	}
}
