package com.jai.linkedlist;

public class IntersectionPointOfALinkedList 
{
    public static MyLinkedList.Node getIntersectionNode(MyLinkedList.Node headA, MyLinkedList.Node headB) 
    {
        if (headA == null || headB == null) 
        {
            return null; // No intersection if either list is empty
        }

        MyLinkedList.Node pointerA = headA;
        MyLinkedList.Node pointerB = headB;

        // Traverse both lists
        while (pointerA != pointerB) 
        {
            // Move to the next node or switch to the head of the other list
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Either both pointers are null (no intersection) or at the intersection node
        return pointerA;
    }

    public static int getIntersectionNode2(MyLinkedList list1, MyLinkedList list2) 
    {
        int size1 = list1.size();
        int size2 = list2.size();

        MyLinkedList.Node ptr1 = list1.head;
        MyLinkedList.Node ptr2 = list2.head;

        // Align the pointers for both lists
        if (size1 > size2) 
        {
            for (int i = 0; i < size1 - size2; i++) 
            {
                ptr1 = ptr1.next;
            }
        } 
        else 
        {
            for (int i = 0; i < size2 - size1; i++) 
            {
                ptr2 = ptr2.next;
            }
        }

        // Traverse both lists simultaneously to find the intersection
        while (ptr1 != null && ptr2 != null) 
        {
            if (ptr1 == ptr2) 
            {
                return ptr1.data; // Intersection found
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return -1; // No intersection

    }
}
