package com.jai.math;

public class AnyBaseMultiplication
{
	/**
	 * this function is to multiply the n1 with n2 of base b
	 * @param n1 number n1
	 * @param n2 number n2
	 * @param b base b
	 * @return value
	 */
	public static int multiplication(int n1, int n2, int b)
	{
		int rv = 0;
		int p = 1;

		while( n2 > 0 )
		{
			int d2 = n2 % 10;
			n2 = n2 / 10;

			int sprd = getMultiplicationWithSingleDigit(b, n1, d2);
			rv = AnyBaseAddition.add(rv, sprd * p, b);
			p *= 10;
		}

		return rv;
	}

	public static int getMultiplicationWithSingleDigit(int b, int n1, int d2)
	{
		int rv = 0;
		int c = 0;
		int p = 1;

		while( n1 > 0 || c > 0 )
		{
			int d1 = n1 % 10;
			n1 = n1 / 10;

			int d = d1 * d2 + c;
			c = d / b;
			d = d % b;

			rv += d * p;
			p *= 10;
		}

		return rv;
	}
}
