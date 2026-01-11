package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OddEvenLinkedListTest {

    @Test
    void testOddEvenList() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        OddEvenLinkedList.oddEvenList(list);

        // Expected: Odd numbers first (1, 3, 5) then even numbers (2, 4)
        // Based on the implementation:
        // 1 (odd) -> addFirst -> 1
        // 2 (even) -> addLast -> 1 -> 2
        // 3 (odd) -> addFirst -> 3 -> 1 -> 2
        // 4 (even) -> addLast -> 3 -> 1 -> 2 -> 4
        // 5 (odd) -> addFirst -> 5 -> 3 -> 1 -> 2 -> 4
        
        assertEquals("5 -> 3 -> 1 -> 2 -> 4 -> null", list.toString());
        assertEquals(5, list.size());
    }

    @Test
    void testOddEvenListWithOnlyOddNumbers() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(3);
        list.addLast(5);

        OddEvenLinkedList.oddEvenList(list);

        // 1 (odd) -> addFirst -> 1
        // 3 (odd) -> addFirst -> 3 -> 1
        // 5 (odd) -> addFirst -> 5 -> 3 -> 1
        
        assertEquals("5 -> 3 -> 1 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testOddEvenListWithOnlyEvenNumbers() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(2);
        list.addLast(4);
        list.addLast(6);

        OddEvenLinkedList.oddEvenList(list);

        // 2 (even) -> addLast -> 2
        // 4 (even) -> addLast -> 2 -> 4
        // 6 (even) -> addLast -> 2 -> 4 -> 6
        
        assertEquals("2 -> 4 -> 6 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testEmptyList() {
        MyLinkedList list = new MyLinkedList();
        OddEvenLinkedList.oddEvenList(list);
        assertEquals("null", list.toString());
        assertEquals(0, list.size());
    }
    
    @Test
    void testSingleElementOdd() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        OddEvenLinkedList.oddEvenList(list);
        assertEquals("1 -> null", list.toString());
        assertEquals(1, list.size());
    }

    @Test
    void testSingleElementEven() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(2);
        OddEvenLinkedList.oddEvenList(list);
        assertEquals("2 -> null", list.toString());
        assertEquals(1, list.size());
    }
}
