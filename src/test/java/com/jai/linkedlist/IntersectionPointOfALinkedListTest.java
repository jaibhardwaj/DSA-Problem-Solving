package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntersectionPointOfALinkedListTest 
{

    @Test
    void testIntersectionWithSameSizeListsAtEnd()
    {
        // Create first list: 1 -> 2 -> 3 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        // Create second list: 4 -> 5 -> 3 -> null (3 is the intersection)
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(4);
        list2.addLast(5);

        // Link list2's tail to list1's tail (node 3)
        list2.tail.next = list1.tail;
        list2.tail = list1.tail;
        list2.size = 3; // 4 -> 5 -> 3

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(3, result);
    }

    @Test
    void testIntersectionWithDifferentSizesFirstLonger()
    {
        // Create first list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);

        // Create second list: 6 -> 7 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(6);
        list2.addLast(7);

        // Make list2 intersect at node 4 of list1
        // Node 4 is at index 3 (0-based)
        MyLinkedList.Node intersectionNode = list1.head.next.next.next; // Node with value 4
        
        list2.tail.next = intersectionNode;
        list2.tail = list1.tail;
        list2.size = 4; // 6 -> 7 -> 4 -> 5

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(4, result);
    }

    @Test
    void testIntersectionWithDifferentSizesSecondLonger() {
        // Create first list: 1 -> 2 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);

        // Create second list: 3 -> 4 -> 5 -> 6 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        // Make list1 intersect at node 5 of list2
        // Node 5 is at index 2 of list2
        MyLinkedList.Node intersectionNode = list2.head.next.next; // Node with value 5

        list1.tail.next = intersectionNode;
        list1.tail = list2.tail;
        list1.size = 4; // 1 -> 2 -> 5 -> 6

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(5, result);
    }

    @Test
    void testIntersectionAtTheMiddle() 
    {
        // Create first list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);

        // Create second list: 6 -> 7 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(6);
        list2.addLast(7);

        // Make list2 intersect at node 3 (third node of list1)
        MyLinkedList.Node intersectionNode = list1.head.next.next; // node with value 3
        
        list2.tail.next = intersectionNode;
        list2.tail = list1.tail;
        list2.size = 5; // 6 -> 7 -> 3 -> 4 -> 5

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(3, result);
    }

    @Test
    void testNoIntersection() 
    {
        // Create first list: 1 -> 2 -> 3 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        // Create second list: 4 -> 5 -> 6 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(4);
        list2.addLast(5);
        list2.addLast(6);

        // Both lists are completely separate
        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(-1, result);
    }

    @Test
    void testIntersectionWithSingleNodeLists() {
        // Create first list: 1 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);

        // Create second list: 1 -> null (same node)
        MyLinkedList list2 = new MyLinkedList();
        // Manually construct list2 to share the head with list1
        list2.head = list1.head;
        list2.tail = list1.tail;
        list2.size = 1;

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(1, result);
    }

    @Test
    void testIntersectionWithLongerFirstList() 
    {
        // Create first list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(7);

        // Create second list: 8 -> 9 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(8);
        list2.addLast(9);

        // Make list2 intersect at node 4 of list1
        // Node 4 is at index 3
        MyLinkedList.Node intersectionNode = list1.head.next.next.next; // node with value 4
        
        list2.tail.next = intersectionNode;
        list2.tail = list1.tail;
        list2.size = 6; // 8 -> 9 -> 4 -> 5 -> 6 -> 7

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(4, result);
    }

    @Test
    void testIntersectionWithZeroValues() 
    {
        // Create first list: 0 -> 1 -> 0 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(0);
        list1.addLast(1);
        list1.addLast(0);

        // Create second list: 2 -> 3 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(2);
        list2.addLast(3);

        // Make list2 intersect at the last node with value 0
        list2.tail.next = list1.tail;
        list2.tail = list1.tail;
        list2.size = 3; // 2 -> 3 -> 0

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(0, result);
    }

    @Test
    void testIntersectionAtFirstCommonNode() 
    {
        // Create first list: 1 -> 2 -> 3 -> null
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        // Create second list: 4 -> 5 -> null
        MyLinkedList list2 = new MyLinkedList();
        list2.addLast(4);
        list2.addLast(5);

        // Make list2 point to list1's head
        MyLinkedList.Node intersectionNode = list1.head; // node with value 1
        
        list2.tail.next = intersectionNode;
        list2.tail = list1.tail;
        list2.size = 5; // 4 -> 5 -> 1 -> 2 -> 3

        int result = IntersectionPointOfALinkedList.getIntersectionNode2(list1, list2);
        assertEquals(1, result);
    }
}
