package com.jai.math;

public class AnyBaseToDecimal
{

	/**
	 * This function is convert any base number to decimal number
	 * @param n number
	 * @param b base
	 * @return decimal number
	 */
	public static int anyBaseToDecimal(int n, int b)
	{
		int rv = 0;
		int p = 1;

		while( n > 0 )
		{
			int q = n % 10;
			n = n / 10;

			rv += q * p;
			p = p * b;
		}

		return rv;
	}
}
