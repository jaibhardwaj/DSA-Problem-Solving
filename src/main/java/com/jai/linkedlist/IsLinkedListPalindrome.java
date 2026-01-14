package com.jai.linkedlist;

public class IsLinkedListPalindrome
{
    private MyLinkedList.Node left;

    /**
     * Check if the linked list is a palindrome using recursion.
     * Similar approach to ReverseLinkedListDataRecursive but without modifying the list.
     * 
     * @param list the linked list to check
     * @return true if the list is a palindrome, false otherwise
     */
    public boolean isPalindromeRecursive(MyLinkedList list)
    {
        if (list.head == null || list.head.next == null)
        {
            return true; // An empty list or single node list is a palindrome
        }

        this.left = list.head;
        return isPalindromeRecursiveHelper(list.head);
    }

    /**
     * Helper method to check if the linked list is a palindrome recursively.
     * Uses the two-pointer approach where 'left' moves forward and 'right' moves backward via recursion.
     * 
     * @param right the current node while traversing to the end
     * @return true if the current segment is palindromic, false otherwise
     */
    private boolean isPalindromeRecursiveHelper(MyLinkedList.Node right)
    {
        if (right == null)
        {
            return true; // Base case: reached the end of the list
        }

        // Recur to the end of the list
        boolean isPalin = isPalindromeRecursiveHelper(right.next);

        // If previous comparisons failed, return false
        if (!isPalin)
        {
            return false;
        }

        // Compare data between left and right
        boolean result = (left.data == right.data);

        // Move left pointer forward for next comparison
        left = left.next;

        return result;
    }

    public boolean isPalindrome(MyLinkedList list) 
    {
        if (list.head == null || list.head.next == null) 
        {
            return true; // An empty list or single node list is a palindrome
        }

        // Step 1: Find the middle of the linked list
        MyLinkedList.Node slow = list.head;
        MyLinkedList.Node fast = list.head;

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        MyLinkedList.Node prev = null;
        MyLinkedList.Node current = slow;
        MyLinkedList.Node next;

        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3: Compare the first half and the reversed second half
        MyLinkedList.Node left = list.head;
        MyLinkedList.Node right = prev; // 'prev' is now the head of the reversed second half

        while (right != null) 
        {
            if (left.data != right.data) 
            {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // Is a palindrome
    }
}
