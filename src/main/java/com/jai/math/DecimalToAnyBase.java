package com.jai.math;

/**
 * This Class is to convert a decimal number to a number of any base
 * Theory Notes : <a href="https://d.docs.live.net/6EE6DA35016AEE6B/Documents/DS_ALGO_PEP/0.%20Basic%20Maths%20-%20Level%20-%201.one#Decimal%20To%20Any%20Base&section-id=">...</a>{5A54DE72-E221-984A-A6FB-AE836EC2D354}&page-id={7E61FBE1-1697-DA48-B10D-E990ABCBC04C}&end
 */
public class DecimalToAnyBase
{
	/**
	 * This function is to convert a decimal number to a number of any base
	 * @param decimal decimal
	 * @param base base
	 * @return the converted number to that base
	 */
	public static int decimalToAnyBase(int decimal, int base)
	{
		int baseNumber = 0;
		int power = 1;

		while( decimal > 0 )
		{
			int quotient = decimal % base;
			decimal = decimal / base;

			baseNumber += quotient * power;
			power = power * 10;

		}

		return baseNumber;
	}
}
