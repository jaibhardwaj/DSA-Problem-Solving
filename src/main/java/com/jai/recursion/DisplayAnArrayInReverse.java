package com.jai.recursion;

public class DisplayAnArrayInReverse
{
	/**
	 * The entry point of the program.
	 * <p>
	 * Initializes an array and invokes the recursive method to display its elements in reverse order.
	 * </p>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 3, 4, 5};
		displayArrayInReverse(arr, 0);
	}

	/**
	 * Recursively displays the elements of an array in reverse order.
	 *
	 * @param arr the array to display
	 * @param index the current index in the array
	 */
	public static void displayArrayInReverse(int[] arr, int index)
	{
		if( index == arr.length )
		{
			return;
		}
		displayArrayInReverse(arr, index + 1);
		System.out.println(arr[index]);
	}
}
