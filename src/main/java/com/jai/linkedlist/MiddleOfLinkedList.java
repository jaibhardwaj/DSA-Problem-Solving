package com.jai.linkedlist;

public class MiddleOfLinkedList 
{
    public static int middleElement(MyLinkedList list) 
    {
        if (list.size() == 0) 
        {
            System.out.println("List is empty");
            return -1;
        }

        MyLinkedList.Node slow = list.head;
        MyLinkedList.Node fast = list.head;

        // Move fast pointer two steps and slow pointer one step
        while (fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
