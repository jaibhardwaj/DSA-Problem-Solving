package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KthElementFromTheEndTest 
{
    @Test
    void testKthFromTheEnd_NormalCases() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        // 0th from end is 50, 1st is 40, 2nd is 30, etc.
        assertEquals(50, KthElementFromTheEnd.kthFromTheEnd(list, 0));
        assertEquals(40, KthElementFromTheEnd.kthFromTheEnd(list, 1));
        assertEquals(30, KthElementFromTheEnd.kthFromTheEnd(list, 2));
        assertEquals(10, KthElementFromTheEnd.kthFromTheEnd(list, 4));
    }

    @Test
    void testKthFromTheEnd_InvalidK() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        assertEquals(-1, KthElementFromTheEnd.kthFromTheEnd(list, -1));
        assertEquals(-1, KthElementFromTheEnd.kthFromTheEnd(list, 2));
        assertEquals(-1, KthElementFromTheEnd.kthFromTheEnd(list, 100));
    }

    @Test
    void testKthFromTheEnd_SingleElement() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(99);
        assertEquals(99, KthElementFromTheEnd.kthFromTheEnd(list, 0));
        assertEquals(-1, KthElementFromTheEnd.kthFromTheEnd(list, 1));
    }

    @Test
    void testKthFromTheEnd_EmptyList() 
    {
        MyLinkedList list = new MyLinkedList();
        assertEquals(-1, KthElementFromTheEnd.kthFromTheEnd(list, 0));
    }
}
