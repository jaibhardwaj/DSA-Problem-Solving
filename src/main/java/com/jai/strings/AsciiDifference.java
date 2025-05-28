package com.jai.strings;

public class AsciiDifference
{
	public static String asciiDiff(String str)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));

		for( int i = 1; i < str.length(); i++ )
		{
			char curr = str.charAt(i);
			char prev = str.charAt(i - 1);

			final int diff = curr - prev;
			sb.append(diff);
			sb.append(curr);
		}

		return sb.toString();
	}
}
