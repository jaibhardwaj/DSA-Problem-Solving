package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoSortedLinkedListTest {
    @Test
    void testMergeBothNonEmpty() 
    {
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);
        MyLinkedList merged = MergeTwoSortedLinkedList.merge(list1, list2);
        assertEquals("1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null", merged.toString());
        assertEquals(6, merged.size());
    }

    @Test
    void testMergeOneEmpty() 
    {
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(10);
        list2.addLast(20);
        MyLinkedList merged = MergeTwoSortedLinkedList.merge(list1, list2);
        assertEquals("10 -> 20 -> null", merged.toString());
        assertEquals(2, merged.size());
    }

    @Test
    void testMergeBothEmpty() 
    {
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        MyLinkedList merged = MergeTwoSortedLinkedList.merge(list1, list2);
        assertEquals("null", merged.toString());
        assertEquals(0, merged.size());
    }

    @Test
    void testMergeWithDuplicates() 
    {
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(2);
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(2);
        list2.addLast(3);
        MyLinkedList merged = MergeTwoSortedLinkedList.merge(list1, list2);
        assertEquals("1 -> 2 -> 2 -> 2 -> 3 -> null", merged.toString());
        assertEquals(5, merged.size());
    }
}
