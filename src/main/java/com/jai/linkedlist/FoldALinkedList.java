package com.jai.linkedlist;

public class FoldALinkedList 
{
    private MyLinkedList.Node left;
    private final int size;
    private final MyLinkedList list;

    public FoldALinkedList(MyLinkedList list) 
    {
        this.left = list.head;
        this.list = list;
        this.size = list.size;
    }

    public void fold() 
    {
        foldHelper(left, 0);
    }

    /**
     * Helper method to fold the linked list recursively.
     * 
     * @param right  The current node being processed.
     * @param floor  The current floor in the recursion.
     */
    private void foldHelper(MyLinkedList.Node right, int floor) 
    {
        if (right == null) 
        {
            return; // Base case: reached the end of the list
        }

        // Recur to the end of the list
        foldHelper(right.next, floor + 1);

        // Fold nodes if floor is greater than or equal to half the size
        if (floor > size / 2) 
        {
            // Store the next node of left
            MyLinkedList.Node temp = left.next;

            // Link left to right
            left.next = right;

            // Link right to temp
            right.next = temp;

            // Move left to the next node
            left = temp;
        }
        else if (floor == size / 2) 
        {
            // Set the next of the middle node to null to terminate the list
            right.next = null;
            list.tail = right;
        }
    }
}
