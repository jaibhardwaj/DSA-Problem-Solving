package com.jai.recursion;

public class FloodFill
{
	public static void main(String[] args)
	{
		int[][] maze = {
				{0, 0, 0, 1},
				{0, 1, 0, 0},
				{0, 0, 0, 1},
				{1, 0, 0, 0}
		};

		boolean[][] visited = new boolean[maze.length][maze[0].length];
		floodFill(maze, 0, 0, "", visited);
	}

	/**
	 * Flood fill algorithm to find all paths from the top-left corner to the bottom-right corner of a maze.
	 *
	 * @param maze 2D array representing the maze (0 = open cell, 1 = blocked cell)
	 * @param row Current row in the maze
	 * @param col Current column in the maze
	 * @param ans String to accumulate the path taken
	 * @param visited 2D array to keep track of visited cells
	 */
	public static void floodFill(int[][] maze, int row, int col, String ans, boolean[][] visited)
	{
		int n = maze.length;
		int m = maze[0].length;

		// Base case: if out of bounds, or cell is blocked, or already visited
		if( row < 0 || col < 0 || row >= n || col >= m || maze[row][col] == 1 || visited[row][col] )
		{
			return;
		}

		// If we reach the destination cell
		if( row == n - 1 && col == m - 1 )
		{
			System.out.println(ans);
			return;
		}

		// Mark the cell as visited
		visited[row][col] = true;

		// Explore all four directions
		floodFill(maze, row + 1, col, ans + "D", visited); // Down
		floodFill(maze, row - 1, col, ans + "U", visited); // Up
		floodFill(maze, row, col + 1, ans + "R", visited); // Right
		floodFill(maze, row, col - 1, ans + "L", visited); // Left

		// Backtrack: unmark the cell
		visited[row][col] = false; // Backtrack
	}
}
