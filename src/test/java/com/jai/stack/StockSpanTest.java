package com.jai.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the StockSpan class.
 */
public class StockSpanTest
{

	@Test
	public void testCalculateSpan_BasicCase()
	{
		int[] prices = {100, 80, 60, 70, 60, 75, 85};
		int[] expected = {1, 1, 1, 2, 1, 4, 6};
		assertArrayEquals(expected, StockSpan.calculateSpan(prices));
	}

	@Test
	public void testCalculateSpan_AllIncreasing()
	{
		int[] prices = {10, 20, 30, 40, 50};
		int[] expected = {1, 2, 3, 4, 5};
		assertArrayEquals(expected, StockSpan.calculateSpan(prices));
	}

	@Test
	public void testCalculateSpan_AllDecreasing()
	{
		int[] prices = {50, 40, 30, 20, 10};
		int[] expected = {1, 1, 1, 1, 1};
		assertArrayEquals(expected, StockSpan.calculateSpan(prices));
	}

	@Test
	public void testCalculateSpan_SingleElement()
	{
		int[] prices = {42};
		int[] expected = {1};
		assertArrayEquals(expected, StockSpan.calculateSpan(prices));
	}

	@Test
	public void testCalculateSpan_EmptyArray()
	{
		int[] prices = {};
		int[] expected = {};
		assertArrayEquals(expected, StockSpan.calculateSpan(prices));
	}
}

