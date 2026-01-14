package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsLinkedListPalindromeTest
{

    @Test
    void testIsPalindromeRecursive()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        IsLinkedListPalindrome checker = new IsLinkedListPalindrome();
        assertTrue(checker.isPalindromeRecursive(list));
    }

    @Test
    void testIsPalindromeRecursiveEvenLength()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);

        IsLinkedListPalindrome checker = new IsLinkedListPalindrome();
        assertTrue(checker.isPalindromeRecursive(list));
    }

    @Test
    void testIsNotPalindromeRecursive()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        IsLinkedListPalindrome checker = new IsLinkedListPalindrome();
        assertFalse(checker.isPalindromeRecursive(list));
    }

    @Test
    void testIsPalindromeRecursiveSingleElement()
    {
        MyLinkedList list = new MyLinkedList();
        list.addLast(1);

        IsLinkedListPalindrome checker = new IsLinkedListPalindrome();
        assertTrue(checker.isPalindromeRecursive(list));
    }

    @Test
    void testIsPalindromeRecursiveEmptyList()
    {
        MyLinkedList list = new MyLinkedList();

        IsLinkedListPalindrome checker = new IsLinkedListPalindrome();
        assertTrue(checker.isPalindromeRecursive(list));
    }
}
