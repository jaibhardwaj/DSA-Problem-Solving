package com.jai.stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeOverlappingIntervals
{
	/**
	 * Merges overlapping intervals in a given array of intervals.
	 *
	 * @param args Command line arguments (not used).
	 */
	public static void main(String[] args)
	{
		int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};
		Stack<Pair> mergedIntervals = mergeIntervals(intervals);

		System.out.println("Merged Intervals:");
		for (Pair interval : mergedIntervals)
		{
			System.out.println(interval);
		}
	}

	/**
	 * Merges overlapping intervals in the given array of intervals.
	 *
	 * @param intervals The array of intervals to merge.
	 * @return A new array containing the merged intervals.
	 */
	public static Stack<Pair> mergeIntervals(int[][] intervals)
	{
		// Convert the 2D array to a list of Pair objects for easier manipulation
		List<Pair> intervalList = new ArrayList<>();
		for (int[] interval : intervals)
		{
			intervalList.add(new Pair(interval[0], interval[1]));
		}

		// Sort the intervals based on the start time
		intervalList.sort(Comparator.naturalOrder());

		Stack<Pair> mergedStack = new Stack<>();

		for (Pair current : intervalList)
		{
			if (mergedStack.isEmpty() || mergedStack.peek().end < current.start)
			{
				// No overlap, push the current interval onto the stack
				mergedStack.push(current);
			}
			else
			{
				// Overlap detected, merge the intervals
				Pair top = mergedStack.pop();
				top.end = Math.max(top.end, current.end);
				mergedStack.push(top);
			}
		}

		return mergedStack;
	}

	/**
	 * A simple Pair class to hold the start and end of an interval.
	 */
	public static class Pair implements Comparable<Pair>
	{
		public int start;
		public int end;

		public Pair(int start, int end)
		{
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString()
		{
			return "[" + start + ", " + end + "]";

		}

		@Override
		public int compareTo(Pair o)
		{
			return Integer.compare(this.start, o.start);
		}
	}
}
