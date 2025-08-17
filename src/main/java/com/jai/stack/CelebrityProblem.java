package com.jai.stack;

import java.util.Stack;

public class CelebrityProblem
{
	public static void main(String[] args)
	{
		// Example usage of the CelebrityProblem class
		int[][] matrix = {
				{0, 1, 0},
				{0, 0, 0},
				{1, 1, 0}
		};

		int celebrity = findCelebrity(matrix);
		System.out.println("The celebrity is at index: " + celebrity);
	}

	/**
	 * Finds the celebrity in a given matrix.
	 * A celebrity is defined as a person who is known by everyone but knows no one.
	 *
	 * @param arr The adjacency matrix representing relationships.
	 * @return The index of the celebrity, or -1 if there is no celebrity.
	 */
	public static int findCelebrity(int[][] arr)
	{
		Stack<Integer> stack = new Stack<>();

		for( int i = 0; i < arr.length; i++ )
		{
			stack.push(i);
		}

		while(stack.size() > 1)
		{
			int a = stack.pop();
			int b = stack.pop();

			// If a knows b, then a cannot be a celebrity, so we push b back onto the stack.
			// If a does not know b, then b cannot be a celebrity, so we push a back onto the stack.
			// This way, we are left with a potential celebrity.
			// The potential celebrity is the one who is not known by anyone else.
			// If arr[a][b] == 1, it means a knows b,
			// so a cannot be a celebrity, and we keep b in the stack.
			// If arr[a][b] == 0, it means a does not know b,
			// so b cannot be a celebrity, and we keep a in the stack.
			// We can also think of it as: if a knows b, then a cannot be a celebrity,
			// so we discard a and keep b, otherwise we discard b and keep a.
			// This process continues until we have one potential celebrity left in the stack.
			if( arr[a][b] == 1 )
			{
				stack.push(b);
			}
			else
			{
				stack.push(a);
			}
		}


		int potentialCelebrity = stack.pop();

		// Now we have a potential celebrity, we need to verify if they are indeed a celebrity.
		// A celebrity is someone who is known by everyone but knows no one.
		// We will check if the potential celebrity knows anyone or if anyone does not know the potential celebrity.
		// If the potential celebrity knows someone or is not known by someone,
		// then they cannot be a celebrity.
		for( int i = 0; i < arr.length; i++ )
		{
			if( i != potentialCelebrity )
			{
				if( arr[potentialCelebrity][i] == 1 || arr[i][potentialCelebrity] == 0 )
				{
					// If the potential celebrity knows someone or is not known by someone,
					// then they cannot be a celebrity.
					// arr[potentialCelebrity][i] == 1 means potentialCelebrity knows i,
					// arr[i][potentialCelebrity] == 0 means i does not know potentialCelebrity.
					// In either case, we return -1 indicating no celebrity found.
					// This means that the potential celebrity is not known by everyone or knows someone.
					// Therefore, we return -1 indicating no celebrity found.
					// If the potential celebrity knows someone or is not known by someone,
					{
						return -1; // No celebrity found
					}
				}
			}

		}

		return potentialCelebrity; // Celebrity found
	}
}
