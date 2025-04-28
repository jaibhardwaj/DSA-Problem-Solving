package com.jai.math;

public class AnyBaseToAnyBase
{
	/**
	 * This function is to convert the Any number of base b1 to base b2
	 * @param n number
	 * @param b1 base b1
	 * @param b2 base b2
	 * @return the number of base b2
	 */
	public static int anyBaseToAnyBase(int n, int b1, int b2)
	{
		if( b1 < 2 || b1 > 10 || b2 < 2 || b2 > 10 )
		{
			return 0;
		}
		int dec = AnyBaseToDecimal.anyBaseToDecimal(n, b1);
		int rv = DecimalToAnyBase.decimalToAnyBase(dec, b2);

		return rv;
	}
}
