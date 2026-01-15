package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoLinkedListTest
{

    @Test
    void testAddTwoListsSameSize()
    {
        // Test case: 123 + 456 = 579
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("5 -> 7 -> 9 -> null", result.toString());
        assertEquals(3, result.size());
    }

    @Test
    void testAddTwoListsDifferentSizeFirstLonger()
    {
        // Test case: 1234 + 56 = 1290
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(5);
        list2.addLast(6);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("1 -> 2 -> 9 -> 0 -> null", result.toString());
        assertEquals(4, result.size());
    }

    @Test
    void testAddTwoListsDifferentSizeSecondLonger()
    {
        // Test case: 12 + 3456 = 3468
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("3 -> 4 -> 6 -> 8 -> null", result.toString());
        assertEquals(4, result.size());
    }

    @Test
    void testAddTwoListsWithCarry()
    {
        // Test case: 99 + 11 = 110
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(9);
        list1.addLast(9);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(1);
        list2.addLast(1);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("1 -> 1 -> 0 -> null", result.toString());
        assertEquals(3, result.size());
    }

    @Test
    void testAddTwoListsWithLargeCarry()
    {
        // Test case: 999 + 1 = 1000
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(9);
        list1.addLast(9);
        list1.addLast(9);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(1);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("1 -> 0 -> 0 -> 0 -> null", result.toString());
        assertEquals(4, result.size());
    }

    @Test
    void testAddTwoListsSingleDigits()
    {
        // Test case: 5 + 3 = 8
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(5);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(3);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("8 -> null", result.toString());
        assertEquals(1, result.size());
    }

    @Test
    void testAddTwoListsSingleDigitsWithCarry()
    {
        // Test case: 7 + 5 = 12
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(7);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(5);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("1 -> 2 -> null", result.toString());
        assertEquals(2, result.size());
    }

    @Test
    void testAddTwoListsWithZeros()
    {
        // Test case: 102 + 304 = 406
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(0);
        list1.addLast(2);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(3);
        list2.addLast(0);
        list2.addLast(4);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("4 -> 0 -> 6 -> null", result.toString());
        assertEquals(3, result.size());
    }

    @Test
    void testAddTwoListsLargeNumbers()
    {
        // Test case: 12345 + 67890 = 80235
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);

        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(6);
        list2.addLast(7);
        list2.addLast(8);
        list2.addLast(9);
        list2.addLast(0);

        MyLinkedList result = AddTwoLinkedList.addTwoLists(list1, list2);

        assertEquals("8 -> 0 -> 2 -> 3 -> 5 -> null", result.toString());
        assertEquals(5, result.size());
    }
}
