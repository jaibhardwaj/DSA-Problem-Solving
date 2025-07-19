package com.jai.recursion;

public class PrintNQueens
{
	public static void main(String[] args)
	{
		int n = 4; // Size of the chessboard
		printNQueens(n, "", 0, new boolean[n][n]);
	}

	/**
	 * This method prints all possible arrangements of N queens on an N x N chessboard.
	 *
	 * @param n           The size of the chessboard (N x N)
	 * @param arrangement The current arrangement of queens
	 * @param row         The current row being processed
	 * @param board       The chessboard represented as a boolean array
	 */
	private static void printNQueens(int n, String arrangement, int row, boolean[][] board)
	{
		// Base case: If all queens are placed
		if( row == n )
		{
			System.out.println(arrangement);
			return;
		}

		// Try placing a queen in each column of the current row
		for( int col = 0; col < n; col++ )
		{
			// Check if it's safe to place a queen at (row, col)
			if( isSafe(board, row, col) )
			{
				board[row][col] = true; // Place queen
				printNQueens(n, arrangement + "Q->" + row  + "-"+ col + " ", row + 1, board);
				board[row][col] = false; // Remove queen
			}
		}
	}

	private static boolean isSafe(boolean[][] board, int row, int col)
	{
		for( int i = 0; i < row; i++ )
		{
			if( board[i][col] )
			{
				return false;
			}
		}

		for( int i = row, j = col; i >= 0 && j >= 0; i--, j-- )
		{
			if( board[i][j] )
			{
				return false;
			}
		}

		for( int i = row, j = col; i >= 0 && j < board.length; i--, j++ )
		{
			if( board[i][j] )
			{
				return false;
			}
		}

		return true;
	}
}
