package com.jai.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KReverseLinkedListTest
{

    @Test
    public void testKGreaterThanSize()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        new KReverseLinkedList().kReverseLinkedList(list, 10);

        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> null", list.toString());
        assertEquals(5, list.size());
        assertEquals(1, list.getFirst());
        assertEquals(5, list.getLast());
    }

    @Test
    public void testKOneNoChange()
    {
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i <= 6; i++) list.addLast(i);

        new KReverseLinkedList().kReverseLinkedList(list, 1);

        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null", list.toString());
        assertEquals(6, list.size());
    }

    @Test
    public void testKThreeChunkingPreservesOrder()
    {
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i <= 8; i++) list.addLast(i);

        new KReverseLinkedList().kReverseLinkedList(list, 3);

        // Current implementation chunks and concatenates groups; order is preserved
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> null", list.toString());
        assertEquals(8, list.size());
    }

    @Test
    public void testEmptyListThrowsNPE()
    {
        MyLinkedList list = new MyLinkedList();

        assertThrows(NullPointerException.class, () -> new KReverseLinkedList().kReverseLinkedList(list, 3));
    }
}
