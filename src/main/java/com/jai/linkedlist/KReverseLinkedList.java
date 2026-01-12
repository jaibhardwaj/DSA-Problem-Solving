package com.jai.linkedlist;

public class KReverseLinkedList 
{
    public void kReverseLinkedList(MyLinkedList list, int k) 
    {
        MyLinkedList prev = null;

        while (list.size() > 0) 
        {
            MyLinkedList current = new MyLinkedList();

            if(list.size() >= k) 
            {
                // Extract k nodes from the original list
                for (int i = 0; i < k; i++) 
                {
                    int val = list.getFirst();
                    list.removeFirst();
                    current.addLast(val);
                }
            }
            else 
            {
                // Extract remaining nodes if less than k
                int remainingSize = list.size();
                for (int i = 0; i < remainingSize; i++) 
                {
                    int val = list.getFirst();
                    list.removeFirst();
                    current.addLast(val);
                }
            }
            

            if (prev == null) 
            {
                prev = current;
            } 
            else 
            {
                prev.tail.next = current.head;
                prev.tail = current.tail;
                prev.size += current.size;
            }
        }

        // Update the original list to be the k-reversed list
        list.head = prev.head;
        list.tail = prev.tail;
        list.size = prev.size;
    }
}
