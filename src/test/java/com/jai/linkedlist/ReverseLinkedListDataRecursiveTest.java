package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseLinkedListDataRecursiveTest
{
    private MyLinkedList list;

    @BeforeEach
    public void setUp()
    {
        list = new MyLinkedList();
    }

    /**
     * Helper method to convert linked list to array for easy comparison
     */
    private int[] linkedListToArray(MyLinkedList.Node head, int size)
    {
        int[] arr = new int[size];
        MyLinkedList.Node current = head;
        for (int i = 0; i < size; i++)
        {
            arr[i] = current.data;
            current = current.next;
        }
        return arr;
    }

    /**
     * Test reversing a linked list with even number of elements
     */
    @Test
    public void testReverseDataRecursiveEvenElements()
    {
        // Create list: 1 -> 2 -> 3 -> 4
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 4 -> 3 -> 2 -> 1
        int[] expected = {4, 3, 2, 1};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with odd number of elements
     */
    @Test
    public void testReverseDataRecursiveOddElements()
    {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 5 -> 4 -> 3 -> 2 -> 1
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with single element
     */
    @Test
    public void testReverseDataRecursiveSingleElement()
    {
        // Create list: 42
        list.addLast(42);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 42
        int[] expected = {42};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with two elements
     */
    @Test
    public void testReverseDataRecursiveTwoElements()
    {
        // Create list: 10 -> 20
        list.addLast(10);
        list.addLast(20);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 20 -> 10
        int[] expected = {20, 10};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with duplicate values
     */
    @Test
    public void testReverseDataRecursiveDuplicateValues()
    {
        // Create list: 5 -> 5 -> 5 -> 5
        list.addLast(5);
        list.addLast(5);
        list.addLast(5);
        list.addLast(5);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 5 -> 5 -> 5 -> 5 (same as original since all are same)
        int[] expected = {5, 5, 5, 5};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with negative numbers
     */
    @Test
    public void testReverseDataRecursiveNegativeNumbers()
    {
        // Create list: -1 -> -2 -> -3 -> -4
        list.addLast(-1);
        list.addLast(-2);
        list.addLast(-3);
        list.addLast(-4);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: -4 -> -3 -> -2 -> -1
        int[] expected = {-4, -3, -2, -1};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with mixed positive and negative numbers
     */
    @Test
    public void testReverseDataRecursiveMixedNumbers()
    {
        // Create list: -5 -> 10 -> -3 -> 8
        list.addLast(-5);
        list.addLast(10);
        list.addLast(-3);
        list.addLast(8);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 8 -> -3 -> 10 -> -5
        int[] expected = {8, -3, 10, -5};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with large numbers
     */
    @Test
    public void testReverseDataRecursiveLargeNumbers()
    {
        // Create list: 1000 -> 2000 -> 3000 -> 4000
        list.addLast(1000);
        list.addLast(2000);
        list.addLast(3000);
        list.addLast(4000);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 4000 -> 3000 -> 2000 -> 1000
        int[] expected = {4000, 3000, 2000, 1000};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with 6 elements (even count)
     */
    @Test
    public void testReverseDataRecursiveSixElements()
    {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        for (int i = 1; i <= 6; i++)
        {
            list.addLast(i);
        }

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 6 -> 5 -> 4 -> 3 -> 2 -> 1
        int[] expected = {6, 5, 4, 3, 2, 1};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test reversing a linked list with 7 elements (odd count)
     */
    @Test
    public void testReverseDataRecursiveSevenElements()
    {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        for (int i = 1; i <= 7; i++)
        {
            list.addLast(i);
        }

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test that the operation is reversible (reverse twice gives original)
     */
    @Test
    public void testReverseDataRecursiveIsReversible()
    {
        // Create list: 1 -> 2 -> 3 -> 4
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        int size = list.size();

        // First reverse
        ReverseLinkedListDataRecursive reverser1 = 
            new ReverseLinkedListDataRecursive(list.head, size);
        reverser1.reverseDataRecursive();

        // Second reverse
        ReverseLinkedListDataRecursive reverser2 = 
            new ReverseLinkedListDataRecursive(list.head, size);
        reverser2.reverseDataRecursive();

        // Should be back to original: 1 -> 2 -> 3 -> 4
        int[] expected = {1, 2, 3, 4};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

    /**
     * Test with zeros in the list
     */
    @Test
    public void testReverseDataRecursiveWithZeros()
    {
        // Create list: 0 -> 1 -> 0 -> 2
        list.addLast(0);
        list.addLast(1);
        list.addLast(0);
        list.addLast(2);

        ReverseLinkedListDataRecursive reverser = 
            new ReverseLinkedListDataRecursive(list.head, list.size());
        reverser.reverseDataRecursive();

        // Expected: 2 -> 0 -> 1 -> 0
        int[] expected = {2, 0, 1, 0};
        int[] actual = linkedListToArray(list.head, list.size());
        assertArrayEquals(expected, actual);
    }

}
