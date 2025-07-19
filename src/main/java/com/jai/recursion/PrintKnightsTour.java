package com.jai.recursion;

public class PrintKnightsTour
{
	public static void main(String[] args)
	{
		int n = 5; // Size of the chessboard
		int[][] board = new int[n][n];
		int moveCount = 1;

		// Starting position of the knight
		int startRow = 3;
		int startCol = 3;

		// Start the knight's tour
		knightsTour(board, startRow, startCol, moveCount);
	}

	private static void knightsTour(int[][] board, int row, int col, int moveCount)
	{
		if( row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != 0 )
		{
			return; // Invalid move or already visited
		}
		else if( moveCount == board.length * board.length )
		{
			board[row][col] = moveCount; // Mark the last move
			printBoard(board); // Print the board when all moves are done
			board[row][col] = 0; // Backtrack
			return;
		}

		// Mark the current position with the move count
	    board[row][col] = moveCount; // Mark the current move

		// Explore all possible knight moves
		knightsTour(board, row + 2, col + 1, moveCount + 1); // Move 1
		knightsTour(board, row + 2, col - 1, moveCount + 1); // Move 2
		knightsTour(board, row - 2, col + 1, moveCount + 1); // Move 3
		knightsTour(board, row - 2, col - 1, moveCount + 1); // Move 4
		knightsTour(board, row + 1, col + 2, moveCount + 1); // Move 5
		knightsTour(board, row + 1, col - 2, moveCount + 1); // Move 6
		knightsTour(board, row - 1, col + 2, moveCount + 1); // Move 7
		knightsTour(board, row - 1, col - 2, moveCount + 1); // Move 8

		board[row][col] = 0; // Backtrack after exploring all moves from this position
	}

	private static void printBoard(int[][] board)
	{
		for( int[] row : board )
		{
			for( int cell : row )
			{
				System.out.printf("%2d ", cell);
			}
			System.out.println();
		}
		System.out.println();
	}

}
