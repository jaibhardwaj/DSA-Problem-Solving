package com.jai.recursion;

public class DisplayAnArray
{
	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes an array and invokes the recursive method to display its elements.
	 * </p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		displayArray(arr, 0);
	}

	/**
	 * Recursively displays the elements of an array.
	 *
	 * @param arr the array to display
	 * @param index the current index in the array
	 */
	public static void displayArray(int[] arr, int index)
	{
		if (index == arr.length)
		{
			return;
		}

		System.out.println(arr[index]);
		displayArray(arr, index + 1);
	}
}
