package com.jai.strings;

public class StringPermutation
{
	public static void permutation(String str)
	{
		int n = str.length();
		int f = factorial(n);

		for( int i = 0; i < f; i++ )
		{
			StringBuilder sb = new StringBuilder(str);
			int temp = i;

			for( int div = n; div > 0; div-- )
			{
				int q = temp / div;
				int r = temp % div;

				System.out.print(sb.charAt(r));

				sb.deleteCharAt(r);

				temp = q;
			}

			System.out.println();
		}
	}

	public static int factorial(int n)
	{
		int fact = 1;
		for( int i = 2; i <= n; i++ )
		{
			fact *= i;
		}

		return fact;
	}
}
