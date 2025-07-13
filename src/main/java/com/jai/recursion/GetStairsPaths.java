package com.jai.recursion;

import java.util.ArrayList;

public class GetStairsPaths
{
	/**
	 * This method generates all possible paths to climb a staircase with a given number of steps.
	 * The person can take either 1, 2, or 3 steps at a time.
	 *
	 * @param n The total number of steps in the staircase.
	 * @return An ArrayList containing all possible paths as strings.
	 */
	public static ArrayList<String> getStairsPaths(int n)
	{
		if( n < 0 )
		{
			return new ArrayList<>(); // No valid paths for negative steps
		}

		if( n == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base; // Base case: one way to stay at the ground (no steps)
		}

		// Recursive calls for the three possible steps (1, 2, or 3)
		ArrayList<String> paths1 = getStairsPaths(n - 1);
		ArrayList<String> paths2 = getStairsPaths(n - 2);
		ArrayList<String> paths3 = getStairsPaths(n - 3);

		// Combine the paths from all three possible steps
		ArrayList<String> result = new ArrayList<>();

		// Prepend the step number to each path
		for( String path : paths1 )
		{
			result.add("1" + path);
		}
		for( String path : paths2 )
		{
			result.add("2" + path);
		}
		for( String path : paths3 )
		{
			result.add("3" + path);
		}

		// Return the combined result
		return result;
	}
}
