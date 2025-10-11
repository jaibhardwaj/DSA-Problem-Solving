package com.jai.linkedlist;

public class MergeSort 
{

    /**
     * Finds the middle node between head and tail in a linked list.
     *
     * @param head The starting node of the linked list segment.
     * @param tail The ending node of the linked list segment.
     * @return The middle node of the linked list segment.
     */
    public static MyLinkedList.Node middleNode(MyLinkedList.Node head, MyLinkedList.Node tail)
    {
        MyLinkedList.Node slow = head;
        MyLinkedList.Node fast = head;

        while( fast != tail && fast.next != tail )
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Performs merge sort on a linked list segment defined by head and tail nodes.
     *
     * @param head The starting node of the linked list segment to be sorted.
     * @param tail The ending node of the linked list segment to be sorted.
     * @return A new sorted linked list containing the elements from the specified segment.
     */
    public static MyLinkedList mergeSort(MyLinkedList.Node head, MyLinkedList.Node tail)
    {
        if( head == tail )
        {
            MyLinkedList base = new MyLinkedList();
            base.addLast(head.data);
            return base;
        }

        MyLinkedList.Node mid = middleNode(head, tail);
        MyLinkedList left = mergeSort(head, mid);
        MyLinkedList right = mergeSort(mid.next, tail);

        return MergeTwoSortedLinkedList.merge(left, right);
    }

}
