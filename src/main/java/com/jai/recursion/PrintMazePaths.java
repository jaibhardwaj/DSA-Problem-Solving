package com.jai.recursion;

public class PrintMazePaths
{


	public static void main(String[] args)
	{
		int sourceRow = 0; // Starting row index
		int sourceCol = 0; // Starting column index
		int destRow = 2;   // Destination row index
		int destCol = 2;   // Destination column index

		// Call the method to print all maze paths from source to destination
		printMazePaths(sourceRow, sourceCol, destRow, destCol, "");
	}

	/**
	 * This method prints all possible paths from the source cell (sr, sc) to the destination cell (dr, dc)
	 * in a maze represented by a grid. The path can only move right (H) or down (V).
	 *
	 * @param sr The starting row index.
	 * @param sc The starting column index.
	 * @param dr The destination row index.
	 * @param dc The destination column index.
	 * @param path The current path taken as a string.
	 */
	public static void printMazePaths(int sr, int sc, int dr, int dc, String path)
	{
		// Base case: if the source and destination are the same, print the path
		if( sr == dr && sc == dc )
		{
			System.out.println(path);
			return;
		}

		// If we go out of bounds, return
		if( sr > dr || sc > dc )
		{
			return;
		}

		// Move horizontally (right)
		printMazePaths(sr, sc + 1, dr, dc, path + "H");

		// Move vertically (down)
		printMazePaths(sr + 1, sc, dr, dc, path + "V");
	}
}
