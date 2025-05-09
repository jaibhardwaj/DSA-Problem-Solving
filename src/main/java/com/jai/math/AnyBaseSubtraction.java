package com.jai.math;

public class AnyBaseSubtraction
{
	/**
	 * this function is to subtraction of n2 from n1 of base b
	 * @param n1 number n1 > n2
	 * @param n2 uber n2
	 * @param b base b
	 * @return subtraction of n1 - n2
	 */
	public static int subtraction(int n1, int n2, int b)
	{
		int rv = 0;
		int p = 1;
		int br = 0;

		while( n1 > 0 )
		{
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;

			d1 = d1 - br;
			br = 0;

			if( d1 < d2 )
			{
				br = 1;
				d1 += b;
			}

			int d = d1 - d2;

			rv += d * p;
			p *= 10;
		}

		return rv;
	}
}
