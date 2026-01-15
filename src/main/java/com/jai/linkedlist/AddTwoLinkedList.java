package com.jai.linkedlist;

public class AddTwoLinkedList 
{
    public static MyLinkedList addTwoLists(MyLinkedList list1, MyLinkedList list2) 
    {
        MyLinkedList result = new MyLinkedList();
    
        int carry = addListHelper(list1.head, list1.size, list2.head, list2.size, result);

        if (carry > 0) 
        {
            result.addFirst(carry);
        }
        return result;
    }

    private static int addListHelper(MyLinkedList.Node node1, int size1, MyLinkedList.Node node2, int size2, MyLinkedList result) 
    {
        if (node1 == null && node2 == null) 
        {
            return 0; // Base case: both lists are empty
        }
    
        int sum;
        if (size1 > size2) 
        {
            int carry = addListHelper(node1.next, size1 - 1, node2, size2, result);
            sum = node1.data + carry;
        } 
        else if (size2 > size1) 
        {
            int carry = addListHelper(node1, size1, node2.next, size2 - 1, result);
            sum = node2.data + carry;
        } 
        else 
        {
            int carry = addListHelper(node1.next, size1 - 1, node2.next, size2 - 1, result);
            sum = node1.data + node2.data + carry;
        }
    
        result.addFirst(sum % 10); // Add the digit to the front of the result list
        return sum / 10; // Return the carry
    }
}
