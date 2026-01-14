package com.jai.linkedlist;

public class ReverseLinkedListDataRecursive 
{
    private MyLinkedList.Node rleft;
    private final int size;

    public ReverseLinkedListDataRecursive(MyLinkedList.Node head, int size) 
    {
        this.rleft = head;
        this.size = size;
    }

    public void reverseDataRecursive() 
    {
        reverseDataHelper(rleft, 0);
    }

    /**
     * Helper method to reverse the data in the linked list recursively.
     * 
     * @param right  The current node being processed.
     * @param floor  The current floor in the recursion.
     */
    private void reverseDataHelper(MyLinkedList.Node right, int floor) 
    {
        if (right == null) 
        {
            return; // Base case: reached the end of the list
        }

        // Recur to the end of the list
        reverseDataHelper(right.next, floor + 1);

        // Swap data if floor is greater than or equal to half the size
        if (floor >= size / 2) 
        {
            // Swap data between rleft and right
            int temp = rleft.data;
            rleft.data = right.data;
            right.data = temp;

            // Move rleft to the next node
            rleft = rleft.next;
        }
    }

}
