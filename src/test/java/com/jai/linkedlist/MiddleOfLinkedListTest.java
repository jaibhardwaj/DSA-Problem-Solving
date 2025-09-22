package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiddleOfLinkedListTest 
{
    @Test
    void testMiddleElement_OddLength() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        // Middle is 3
        assertEquals(3, MiddleOfLinkedList.middleElement(list));
    }

    @Test
    void testMiddleElement_EvenLength() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        // Middle should be 20 (first of the two middles)
        assertEquals(20, MiddleOfLinkedList.middleElement(list));
    }

    @Test
    void testMiddleElement_SingleElement() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(99);
        assertEquals(99, MiddleOfLinkedList.middleElement(list));
    }

    @Test
    void testMiddleElement_EmptyList() 
    {
        MyLinkedList list = new MyLinkedList();
        assertEquals(-1, MiddleOfLinkedList.middleElement(list));
    }
}
