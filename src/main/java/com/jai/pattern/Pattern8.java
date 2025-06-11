package com.jai.pattern;

/**
 * The Pattern8 class provides a method to print a specific pattern to the console.
 * The pattern consists of a single diagonal line of asterisks ('*') from the top-right
 * to the bottom-left of an n x n grid, with spaces elsewhere.
 */
public class Pattern8
{
    /**
     * Prints an n x n pattern where asterisks ('*') appear on the anti-diagonal
     * (from top-right to bottom-left), and all other positions are filled with spaces.
     *
     * Example for n = 5:
     *     *
     *    *
     *   *
     *  *
     * *
     *
     * @param n the size of the pattern (number of rows and columns)
     */
    public static void pattern8(int n)
    {
        for( int i = 1; i <= n; i++ )
        {
            for( int j = 1; j <= n; j++ )
            {
                if( i + j == n + 1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
