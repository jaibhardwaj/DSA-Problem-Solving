package com.jai.recursion;

import java.util.ArrayList;

public class GetMazePaths
{
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc)
	{
		// Base case
		if( sr == dr && sc == dc )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		ArrayList<String> hPaths = new ArrayList<>();
		ArrayList<String> vPaths = new ArrayList<>();

		// Horizontal and vertical moves
		if( sr < dr )
		{
			hPaths = getMazePaths(sr + 1, sc, dr, dc);
		}

		if( sc < dc )
		{
			vPaths = getMazePaths(sr, sc + 1, dr, dc);

		}

		// Combine paths
		ArrayList<String> paths = new ArrayList<>();

		// Add horizontal paths with 'H' prefix
		for( String path : hPaths )
		{
			paths.add("H" + path);
		}

		// Add vertical paths with 'V' prefix
		for( String path : vPaths )
		{
			paths.add("V" + path);
		}

		return paths;
	}
}
