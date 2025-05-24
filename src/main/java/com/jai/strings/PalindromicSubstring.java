package com.jai.strings;

public class PalindromicSubstring
{
	public static int palindromicSubstring(String s)
	{
		int subsCount = 0;
		for( int i = 0; i < s.length(); i++ )
		{
			for( int j = i + 1; j <= s.length(); j++ )
			{
				String sub = s.substring(i, j);
				if( isPalindrom(sub) )
				{
					System.out.println(sub);
					subsCount++;
				}
			}
		}
		return subsCount;
	}

	private static boolean isPalindrom(String s)
	{
		int i = 0;
		int j = s.length() - 1;

		while(i <= j)
		{
			char c1 = s.charAt(i);
			char c2 = s.charAt(j);
			if( c1 != c2 )
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}

		return true;
	}
}
