package com.jai.sorting;

public class SortDates
{
	public static void main(String[] args)
	{
		String[] dates = {"12041996", "20101996", "05061997", "12041989", "11081987"};
		System.out.println("Before sorting:");
		for( String date : dates )
		{
			System.out.print(date + " ");
		}

		System.out.println();
		sortDates(dates);
		System.out.println("After sorting:");
		for( String date : dates )
		{
			System.out.print(date + " ");
		}
	}

	// sort the dates using counting sort
	// 12041996 where 12 is the month, 04 is the day, and 1996 is the year
	public static void sortDates(String[] dates)
	{
		// sort day
		countSort(dates, 1000000, 100, 32);
		// sort month
		countSort(dates, 10000, 100, 13);
		// sort year
		countSort(dates, 1, 10000, 3000);
	}

	/**
	 * A stable counting sort implementation that sorts the dates based on a specific digit.
	 * For example, for days it is 32 (1-31 + 1for 0), for months it is 13 (1-12 + 1 for 0), and for years it is 3000 (0-2999 + 1 for 0).
	 * This method assumes that the dates are in the format DDMMYYYY.
	 * This implementation is stable and works in O(n + k) time complexity, where n is the number of elements in the array and k is the range of the digit being sorted.
	 * @param arr The array of dates to be sorted.
	 * @param divisor The divisor to extract the digit to be sorted.
	 * @param mod The modulus to determine the range of the digit.
	 * @param range The range of possible values for the digit.
	 */
	public static void countSort(String[] arr, int divisor, int mod, int range)
	{
		int n = arr.length;
		String[] output = new String[n];
		int[] count = new int[range];

		for( String date : arr )
		{
			int key = Integer.parseInt(date, 10) / divisor % mod;
			count[key]++;
		}

		// Change count[i] so that it contains the actual position of this digit in output[]
		for( int i = 1; i < range; i++ )
		{
			count[i] += count[i - 1];
		}

		// Build the output array
		for( int i = n - 1; i >= 0; i-- )
		{
			int key = count[Integer.parseInt(arr[i], 10) / divisor % mod] - 1;
			output[key] = arr[i];
			count[Integer.parseInt(arr[i], 10) / divisor % mod]--;
		}

		// Copy the output array to arr[]
		System.arraycopy(output, 0, arr, 0, n);
	}
}
