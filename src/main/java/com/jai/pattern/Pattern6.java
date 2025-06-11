package com.jai.pattern;

/**
 * The Pattern6 class provides a method to print a specific star pattern based on the input size.
 */
public class Pattern6
{
    /**
     * Prints a symmetric star pattern with spaces in the middle.
     * The pattern consists of two mirrored triangles of stars separated by spaces,
     * forming a diamond-like shape.
     *
     * Example for n = 7:
     * ****   ****
     * ***     ***
     * **       **
     * *         *
     * **       **
     * ***     ***
     * ****   ****
     *
     * @param n The number of rows for the pattern. Should be an odd positive integer for symmetry.
     */
    public static void pattern6(int n)
    {
        int sp = 1; // Number of spaces to print before stars on each line
        int st = n / 2 + 1; // Number of stars to print on each line

        // Loop through each row
        for( int i = 1; i <= n; i++ )
        {

            // Print stars for the current row (left side)
            for( int j = 1; j <= st; j++ )
            {
                System.out.print("*");
            }

            // Print spaces for the current row (middle)
            for( int j = 1; j <= sp; j++ )
            {
                System.out.print(" ");
            }

            // Print stars for the current row (right side)
            for( int j = 1; j <= st; j++ )
            {
                System.out.print("*");
            }

            // Adjust the number of spaces and stars for the next row
            if( i <= n / 2 )
            {
                sp += 2; // Increase spaces in the upper half
                st--;    // Decrease stars in the upper half
            }
            else
            {
                st++;    // Increase stars in the lower half
                sp -= 2; // Decrease spaces in the lower half
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
