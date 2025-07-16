package com.jai.recursion;

public class PrintStairPaths
{

	public static void main(String[] args)
	{
		int n = 4; // Example: number of steps in the staircase
		printStairPaths(n, ""); // Start with an empty path
	}

	/**
	 * This method prints all possible paths to climb a staircase with n steps,
	 * where you can take 1, 2, or 3 steps at a time.
	 *
	 * @param n    The number of steps in the staircase.
	 * @param path The current path taken to reach the step.
	 */
	public static void printStairPaths(int n, String path)
	{
		// Base case: if n is 0, print the path
		if( n == 0 )
		{
			System.out.println(path);
			return;
		}

		// If n is negative, return (no valid path)
		if( n < 0 )
		{
			return;
		}

		// Recursive calls for steps of size 1, 2, and 3
		printStairPaths(n - 1, path + "1");
		printStairPaths(n - 2, path + "2");
		printStairPaths(n - 3, path + "3");
	}
}
