package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest 
{
    @Test
    void testAddLastAndToString() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        assertEquals("1 -> 2 -> 3 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testAddFirst() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        assertEquals("20 -> 10 -> null", list.toString());
        assertEquals(2, list.size());
    }

    @Test
    void testAddAt() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(3);
        list.addAt(1, 2);
        assertEquals("1 -> 2 -> 3 -> null", list.toString());
        assertEquals(3, list.size());
    }

    @Test
    void testRemoveFirst() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.removeFirst();
        assertEquals("2 -> null", list.toString());
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveLast() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.removeLast();
        assertEquals("1 -> null", list.toString());
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveAt() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.removeAt(1);
        assertEquals("1 -> 3 -> null", list.toString());
        assertEquals(2, list.size());
    }

    @Test
    void testGetAt() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        assertEquals(6, list.getAt(1));
    }

    @Test
    void testReverseDI() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.reverseDI();
        assertEquals("3 -> 2 -> 1 -> null", list.toString());
    }

    @Test
    void testReversePI() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.reversePI();
        assertEquals("3 -> 2 -> 1 -> null", list.toString());
    }

    @Test
    void testGetFirstAndGetLast() 
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        assertEquals(10, list.getFirst());
        assertEquals(20, list.getLast());
    }

    @Test
    void testEmptyList() 
    {
        MyLinkedList list = new MyLinkedList();
        assertEquals(0, list.size());
        assertEquals(-1, list.getFirst());
        assertEquals(-1, list.getLast());
        assertEquals(-1, list.getAt(0));
    }

    @Test
    void testReverseDisplay() {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        list.reverseDisplay();

        // Reset System.out
        System.setOut(System.out);

        // Expected output: "3 2 1 " followed by a newline
        String expectedOutput = "3 2 1 " + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
