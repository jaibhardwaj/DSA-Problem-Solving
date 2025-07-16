package com.jai.recursion;

public class PrintMazePathsWithJump
{
	public static void main(String[] args)
	{
		int sourceRow = 0;
		int sourceCol = 0;
		int destinationRow = 2;
		int destinationCol = 2;

		printMazePathsWithJump(sourceRow, sourceCol, destinationRow, destinationCol, "");
	}

	/**
	 * This method prints all possible paths from the source (sr, sc) to the destination (dr, dc)
	 * in a maze, allowing for jumps in horizontal, vertical, and diagonal directions.
	 *
	 * @param sr  Source row index
	 * @param sc  Source column index
	 * @param dr  Destination row index
	 * @param dc  Destination column index
	 * @param ans The current path as a string
	 */
	public static void printMazePathsWithJump(int sr, int sc, int dr, int dc, String ans)
	{
		// Base case: if the source equals the destination, print the answer
		if( sr == dr && sc == dc )
		{
			System.out.println(ans);
			return;
		}

		// If out of bounds, return
		if( sr > dr || sc > dc )
		{
			return;
		}

		// Horizontal moves
		for( int jump = 1; jump <= dc - sc; jump++ )
		{
			printMazePathsWithJump(sr, sc + jump, dr, dc, ans + "h" + jump);
		}

		// Vertical moves
		for( int jump = 1; jump <= dr - sr; jump++ )
		{
			printMazePathsWithJump(sr + jump, sc, dr, dc, ans + "v" + jump);
		}

		// Diagonal moves
		for( int jump = 1; jump <= Math.min(dr - sr, dc - sc); jump++ )
		{
			printMazePathsWithJump(sr + jump, sc + jump, dr, dc, ans + "d" + jump);
		}
	}
}
