package com.jai.recursion;

import java.util.ArrayList;

public class MazaPathsWithJump
{
	/**
	 * This method finds all the paths from the top-left corner (sr, sc) to the bottom-right corner (dr, dc)
	 * of a grid, allowing horizontal, vertical, and diagonal moves with jumps.
	 *
	 * @param sr Starting row index
	 * @param sc Starting column index
	 * @param dr Destination row index
	 * @param dc Destination column index
	 * @return A list of strings representing all possible paths
	 */
	public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc)
	{
		// Base case: if the starting position is the same as the destination
		if (sr == dr && sc == dc)
		{

			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		ArrayList<String> paths = new ArrayList<>();

		// horizontal moves
		// We can move horizontally from the current column to the destination column
		for( int ms = 0; ms <= dc - sc; ms++ )
		{
			ArrayList<String> hPaths = getPaths(sr, sc + 1, dr, dc);
			for( String path : hPaths )
			{
				paths.add("h" + ms + path);
			}
		}

		// vertical moves
		// We can move vertically from the current row to the destination row
		for( int ms = 0; ms <= dr - sr; ms++ )
		{
			ArrayList<String> vPaths = getPaths(sr + 1, sc, dr, dc);
			for( String path : vPaths )
			{
				paths.add("v" + ms + path);
			}
		}

		// diagonal moves
		// We can move diagonally from the current position to the destination position
		for( int ms = 0; ms <= Math.min(dr - sr, dc - sc); ms++ )
		{
			ArrayList<String> dPaths = getPaths(sr + 1, sc + 1, dr, dc);
			for( String path : dPaths )
			{
				paths.add("d" + ms + path);
			}
		}

		return paths;
	}
}
