package com.jai.arrays;

public class SubsetsOfAnArray
{

	public static void main(String[] args)
	{
		subset(new int[]{1, 2, 3});
	}
	public static void subset(int[] arr)
	{
		int limit = (int)Math.pow(2, arr.length);

		for( int i = 0; i < limit; i++ )
		{
			int temp = i;
			StringBuilder set = new StringBuilder();

			for( int j = arr.length - 1; j >= 0 ; j-- )
			{
				int r = temp % 2;
				temp = temp / 2;

				if( r == 0 )
				{
					set.insert(0, "-\t");
				}
				else
				{
					set.insert(0, arr[j] + "\t");
				}
			}

			System.out.println(set);
		}
	}
}
