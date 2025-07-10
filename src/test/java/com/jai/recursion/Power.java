package com.jai.recursion;

/**
 * Utility class for calculating powers using different methods.
 * Provides linear, recursive, and logarithmic approaches to compute x^n.
 */
public class Power
{
    /**
     * Calculates x raised to the power n using a linear iterative approach.
     *
     * @param x the base
     * @param n the exponent (non-negative integer)
     * @return x raised to the power n
     */
    public static int powerUsingLinear(int x, int n)
    {
        int pow = 1;

        for( int i = 1; i <= n; i++ )
        {
            pow *= x;
        }

        return pow;
    }

    /**
     * Calculates x raised to the power n using recursion.
     *
     * @param x the base
     * @param n the exponent (non-negative integer)
     * @return x raised to the power n
     */
    public static int powerUsingRecursion(int x, int n)
    {
        if( n == 0 )
        {
            return 1;
        }

        return x * powerUsingRecursion(x, n - 1);
    }

    /**
     * Calculates x raised to the power n using logarithmic (fast exponentiation) approach.
     *
     * @param x the base
     * @param n the exponent (non-negative integer)
     * @return x raised to the power n
     */
    public static int powerUsingLogarithmic(int x, int n)
    {
        if( n == 0 )
        {
            return 1;
        }

        int halfPower = powerUsingLogarithmic(x, n / 2);
        int xn = halfPower * halfPower;

        if( n % 2 == 1 )
        {
            xn *= x; // If n is odd, multiply by x once more
        }

        return xn;
    }
}
