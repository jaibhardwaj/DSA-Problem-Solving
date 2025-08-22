package com.jai.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for MergeOverlappingIntervals.
 */
class MergeOverlappingIntervalsTest
{

	private List<int[]> stackToList(Stack<MergeOverlappingIntervals.Pair> stack)
	{
		List<int[]> result = new ArrayList<>();
		for( MergeOverlappingIntervals.Pair p : stack )
		{
			result.add(new int[]{p.start, p.end});
		}
		return result;
	}

	@Test
	void testOverlappingIntervals()
	{
		int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};
		Stack<MergeOverlappingIntervals.Pair> merged = MergeOverlappingIntervals.mergeIntervals(intervals);
		List<int[]> result = stackToList(merged);
		assertEquals(2, result.size());
		assertArrayEquals(new int[]{1, 4}, result.get(0));
		assertArrayEquals(new int[]{5, 8}, result.get(1));
	}

	@Test
	void testNonOverlappingIntervals()
	{
		int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
		Stack<MergeOverlappingIntervals.Pair> merged = MergeOverlappingIntervals.mergeIntervals(intervals);
		List<int[]> result = stackToList(merged);
		assertEquals(3, result.size());
		assertArrayEquals(new int[]{1, 2}, result.get(0));
		assertArrayEquals(new int[]{3, 4}, result.get(1));
		assertArrayEquals(new int[]{5, 6}, result.get(2));
	}

	@Test
	void testContainedIntervals()
	{
		int[][] intervals = {{1, 10}, {2, 3}, {4, 5}};
		Stack<MergeOverlappingIntervals.Pair> merged = MergeOverlappingIntervals.mergeIntervals(intervals);
		List<int[]> result = stackToList(merged);
		assertEquals(1, result.size());
		assertArrayEquals(new int[]{1, 10}, result.getFirst());
	}

	@Test
	void testSingleInterval()
	{
		int[][] intervals = {{1, 5}};
		Stack<MergeOverlappingIntervals.Pair> merged = MergeOverlappingIntervals.mergeIntervals(intervals);
		List<int[]> result = stackToList(merged);
		assertEquals(1, result.size());
		assertArrayEquals(new int[]{1, 5}, result.getFirst());
	}

	@Test
	void testEmptyInput()
	{
		int[][] intervals = {};
		Stack<MergeOverlappingIntervals.Pair> merged = MergeOverlappingIntervals.mergeIntervals(intervals);
		List<int[]> result = stackToList(merged);
		assertEquals(0, result.size());
	}
}

