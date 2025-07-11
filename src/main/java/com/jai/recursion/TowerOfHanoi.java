package com.jai.recursion;

/**
 * Class to solve the Tower of Hanoi problem using recursion.
 */
public class TowerOfHanoi
{
	/**
	 * Solves the Tower of Hanoi problem recursively.
	 *
	 * @param n the number of disks
	 * @param source the source peg
	 * @param target the target peg
	 * @param auxiliary the auxiliary peg
	 */
	public static void solve(int n, String source, String target, String auxiliary)
	{
		if( n == 0 )
		{
			return;
		}

		solve(n - 1, source, auxiliary, target);
		System.out.println("Move disk " + n + " from " + source + " to " + target);
		solve(n - 1, auxiliary, target, source);
	}

	/**
	 * Main method to run the Tower of Hanoi solution.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		int n = 3; // Number of disks
		String source = "A";
		String target = "C";
		String auxiliary = "B";
		System.out.println("Tower of Hanoi solution for " + n + " disks:");
		solve(n, source, target, auxiliary);
	}
}
