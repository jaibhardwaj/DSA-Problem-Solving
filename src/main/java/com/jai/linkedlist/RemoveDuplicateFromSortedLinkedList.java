package com.jai.linkedlist;

public class RemoveDuplicateFromSortedLinkedList 
{
    /**
     * Removes duplicates from a sorted linked list.
     *
     * @param list The sorted linked list from which to remove duplicates.
     */
    public static void removeDuplicates(MyLinkedList list) 
    {
        if (list.head == null) 
        {
            return; // Empty list, nothing to do
        }

        MyLinkedList.Node current = list.head;

        while (current.next != null)
        {
            if (current.data == current.next.data) 
            {
                // Duplicate found, skip the next node
                current.next = current.next.next;
                    list.decrementSize(); // Decrease size as we removed a node
            } 
            else 
            {
                current = current.next; // Move to the next node
            }
        }

        // Update tail reference
        list.tail = current;
    }

}
