package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
    @Test
    void testMergeSort_NormalCase() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(4);
        list.addLast(2);
        list.addLast(5);
        list.addLast(1);
        list.addLast(3);
        MyLinkedList sorted = MergeSort.mergeSort(list.head, list.tail);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> null", sorted.toString());
        assertEquals(5, sorted.size());
    }

    @Test
    void testMergeSort_AlreadySorted() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        MyLinkedList sorted = MergeSort.mergeSort(list.head, list.tail);
        assertEquals("1 -> 2 -> 3 -> null", sorted.toString());
        assertEquals(3, sorted.size());
    }

    @Test
    void testMergeSort_ReverseOrder() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        MyLinkedList sorted = MergeSort.mergeSort(list.head, list.tail);
        assertEquals("1 -> 2 -> 3 -> null", sorted.toString());
        assertEquals(3, sorted.size());
    }

    @Test
    void testMergeSort_SingleElement() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(42);
        MyLinkedList sorted = MergeSort.mergeSort(list.head, list.tail);
        assertEquals("42 -> null", sorted.toString());
        assertEquals(1, sorted.size());
    }
}
