package com.jai.strings;

public class ToggleCase
{
	public static String toggleCase(String str)
	{
		StringBuilder sb = new StringBuilder(str);

		for( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt(i);

			if( ch >= 'a' && ch <= 'z' )
			{
				char uch = (char) ('A' + ch - 'a');
				sb.setCharAt(i, uch);
			}
			else if( ch >= 'A' && ch <= 'Z' )
			{
				char lch = (char) ('a' + ch - 'A');
				sb.setCharAt(i, lch);
			}
		}

		return sb.toString();
	}
}
