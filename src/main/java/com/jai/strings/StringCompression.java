package com.jai.strings;

public class StringCompression
{
	public static void main(String[] args)
	{
		System.out.println(compression2("aaabbcccddaeef"));
	}

	public static String compression1(String str)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));

		for( int i = 1; i < str.length(); i++ )
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

			if( curr != prev )
			{
				sb.append(curr);
			}
		}

		return sb.toString();
	}

	public static String compression2(String str)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));

		int count = 1;

		for( int i = 1; i < str.length(); i++ )
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

			if( curr == prev )
			{
				count++;
			}
			else
			{
				if( count > 1 )
				{
					sb.append(count);
				}

				sb.append(curr);
				count = 1;
			}
		}

		if(count > 0)
		{
			sb.append(count);
		}

		return sb.toString();
	}

}
