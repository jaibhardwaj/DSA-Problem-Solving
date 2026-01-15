package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoldALinkedListTest
{

    @Test
    void testFoldOddLength()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        FoldALinkedList folder = new FoldALinkedList(list);
        folder.fold();

        // Expected: 1 -> 5 -> 2 -> 4 -> 3 -> null
        assertEquals("1 -> 5 -> 2 -> 4 -> 3 -> null", list.toString());
        assertEquals(5, list.size());
    }

    @Test
    void testFoldEvenLength()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        FoldALinkedList folder = new FoldALinkedList(list);
        folder.fold();

        // Expected: 1 -> 4 -> 2 -> 3 -> null
        assertEquals("1 -> 4 -> 2 -> 3 -> null", list.toString());
        assertEquals(4, list.size());
    }

    @Test
    void testFoldSingleElement()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);

        FoldALinkedList folder = new FoldALinkedList(list);
        folder.fold();

        assertEquals("1 -> null", list.toString());
        assertEquals(1, list.size());
    }

    @Test
    void testFoldEmptyList()
    {
        MyLinkedList list = new MyLinkedList();
        FoldALinkedList folder = new FoldALinkedList(list);
        folder.fold();

        assertEquals("null", list.toString());
        assertEquals(0, list.size());
    }
    
    @Test
    void testFoldTwoElements()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        
        FoldALinkedList folder = new FoldALinkedList(list);
        folder.fold();
        
        // 1 -> 2 -> null
        assertEquals("1 -> 2 -> null", list.toString());
        assertEquals(2, list.size());
    }
}
