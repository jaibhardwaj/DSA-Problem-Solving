package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellRotateTest
{
	/**
	 * Helper method to compare two 2D arrays for equality.
	 */
	private void assert2dArrayEquals(int[][] expected, int[][] actual)
	{
		assertEquals(expected.length, actual.length, "Row counts differ");
		for( int i = 0; i < expected.length; i++ )
		{
			assertArrayEquals(expected[i], actual[i], "Row " + i + " differs");
		}
	}

	@Test
	public void testShellRotate_Shell1_Rotate2()
	{
		int[][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};

		// Expected after rotating shell 1 (outer layer) by 2 positions
		int[][] expected = {
				{3, 4, 8, 12},
				{2, 6, 7, 16},
				{1, 10, 11, 15},
				{5, 9, 13, 14}
		};

		ShellRotate.shellRoate(arr, 1, 2);

		assert2dArrayEquals(expected, arr);
	}

	@Test
	public void testShellRotate_Shell2_Rotate1()
	{
		int[][] arr = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}
		};

		// Expected after rotating shell 2 (second layer) by 1 position
		int[][] expected = {
				{1, 2, 3, 4, 5},
				{6, 8, 9, 14, 10},
				{11, 7, 13, 19, 15},
				{16, 12, 17, 18, 20},
				{21, 22, 23, 24, 25}
		};

		ShellRotate.shellRoate(arr, 2, 1);

		assert2dArrayEquals(expected, arr);
	}


}