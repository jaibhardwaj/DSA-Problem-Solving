package com.jai.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateAnArrayTest
{

	@Test
	void rotate1()
	{
		int[] arr = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 1);
		assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr);

		int[] arr2 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 2);
		assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr2);

		int[] arr3 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 3);
		assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr3);

		int[] arr4 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 4);
		assertArrayEquals(new int[]{2, 3, 4, 5, 1}, arr4);

		int[] arr5 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 5);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr5);

		int[] arr6 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 6);
		assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr6);

		int[] arr7 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, 73);
		assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr7);

		int[] arr8 = RotateAnArray.rotate1(new int[]{1, 2, 3, 4, 5}, -8);
		assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr8);
	}

	@Test
	void rotate2()
	{

		int[] arr = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 1);
		assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr);

		int[] arr2 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 2);
		assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr2);

		int[] arr3 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 3);
		assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr3);

		int[] arr4 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 4);
		assertArrayEquals(new int[]{2, 3, 4, 5, 1}, arr4);

		int[] arr5 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 5);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr5);

		int[] arr6 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 6);
		assertArrayEquals(new int[]{5, 1, 2, 3, 4}, arr6);

		int[] arr7 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, 73);
		assertArrayEquals(new int[]{3, 4, 5, 1, 2}, arr7);

		int[] arr8 = RotateAnArray.rotate2(new int[]{1, 2, 3, 4, 5}, -8);
		assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr8);
	}
}