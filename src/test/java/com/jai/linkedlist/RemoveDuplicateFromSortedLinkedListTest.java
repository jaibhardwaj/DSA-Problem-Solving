package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateFromSortedLinkedListTest 
{
    @Test
    void testRemoveDuplicates_MyLinkedListMethod() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        // If MyLinkedList has a removeDuplicates method
        // list.removeDuplicates();
        // If not, call RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        assertEquals("1 -> 2 -> 3 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testRemoveDuplicates_MultipleDuplicates() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        assertEquals("1 -> 2 -> 3 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testRemoveDuplicates_NoDuplicates() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        assertEquals("1 -> 2 -> 3 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testRemoveDuplicates_AllDuplicates() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(5);
        list.addLast(5);
        list.addLast(5);
        RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        assertEquals("5 -> null", list.toString());
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveDuplicates_EmptyList() {
        MyLinkedList list = new MyLinkedList();
        RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        assertEquals("null", list.toString());
        assertEquals(0, list.size());
    }

    @Test
    void testRemoveDuplicates_SingleElement() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(42);
        RemoveDuplicateFromSortedLinkedList.removeDuplicates(list);
        assertEquals("42 -> null", list.toString());
        assertEquals(1, list.size());
    }
}
