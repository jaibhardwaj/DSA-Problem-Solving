package com.jai.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal
{
	public static List<Integer> traverse(int[][] arr)
	{
		int row = arr.length;
		int col = arr[0].length;

		int left = 0, right = col - 1;
		int top = 0, bottom = row - 1;
		List<Integer> ans = new ArrayList<>();

		while(left <= right && top <= bottom)
		{
			// right
			for( int i = left; i <= right; i++ )
			{
				ans.add(arr[top][i]);
			}
			top++;

			// bottom
			for( int i = top; i <= bottom; i++ )
			{
				ans.add(arr[i][right]);
			}
			right--;

			if( top <= bottom )
			{
				// left
				for( int i = right; i >= left; i-- )
				{
					ans.add(arr[bottom][i]);
				}
				bottom--;
			}

			if( left <= right )
			{
				// top
				for( int i = bottom; i >= top; i-- )
				{
					ans.add(arr[i][left]);
				}
				left++;
			}
		}

		return ans;

	}
}
