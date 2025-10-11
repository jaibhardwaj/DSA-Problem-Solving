package com.jai.linkedlist;

public class MergeTwoSortedLinkedList
{

    /**
     * Merges two sorted linked lists into a single sorted linked list.
     *
     * @param list1 The first sorted linked list.
     * @param list2 The second sorted linked list.
     * @return A new linked list containing all elements from both lists in sorted order.
     */
    public static MyLinkedList merge(MyLinkedList list1, MyLinkedList list2) 
    {
        MyLinkedList mergedList = new MyLinkedList();
        MyLinkedList.Node ptr1 = list1.head;
        MyLinkedList.Node ptr2 = list2.head;

        while (ptr1 != null && ptr2 != null) 
        {
            if (ptr1.data <= ptr2.data) 
            {
                mergedList.addLast(ptr1.data);
                ptr1 = ptr1.next;
            } 
            else 
            {
                mergedList.addLast(ptr2.data);
                ptr2 = ptr2.next;
            }
        }

        while (ptr1 != null) 
        {
            mergedList.addLast(ptr1.data);
            ptr1 = ptr1.next;
        }

        while (ptr2 != null) 
        {
            mergedList.addLast(ptr2.data);
            ptr2 = ptr2.next;
        }

        return mergedList;
    }

}
