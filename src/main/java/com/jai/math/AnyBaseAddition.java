package com.jai.math;

public class AnyBaseAddition
{
	/**
	 * this function is to add two number of any base b
	 * @param n1 number n1
	 * @param n2 number n2
	 * @param b base b of n1 and n2
	 * @return added number of base b
	 */
	public static int add(int n1, int n2, int b)
	{
		int add = 0;
		int p = 1;
		int c = 0;

		while(n1 > 0 || n2 > 0 || c > 0)
		{
			int dig1 = n1 % 10;
			int dig2 = n2 % 10;

			n1 = n1 / 10;
			n2 = n2 / 10;

			int d = dig1 + dig2 + c;

			c = d / b;
			d = d % b;

			add += d * p;
			p *= 10;
		}

		return add;
	}
}
