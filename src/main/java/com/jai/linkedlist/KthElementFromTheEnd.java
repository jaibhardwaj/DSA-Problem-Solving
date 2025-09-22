package com.jai.linkedlist;

public class KthElementFromTheEnd 
{
    public static int kthFromTheEnd(MyLinkedList list, int k) 
    {
        if (k < 0 || k >= list.size()) 
        {
            System.out.println("Invalid value of k");
            return -1;
        }

        MyLinkedList.Node slow = list.head;
        MyLinkedList.Node fast = list.head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) 
        {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}
