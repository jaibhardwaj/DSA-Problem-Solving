package com.jai.linkedlist;

public class LinkedListToQueueAdapter 
{
    private MyLinkedList list;

    public LinkedListToQueueAdapter() 
    {
        list = new MyLinkedList();
    }

    public void enqueue(int val) 
    {
        list.addLast(val);
    }

    public int dequeue() 
    {
        if (list.size() == 0) 
        {
            System.out.println("Queue underflow");
            return -1;
        }
        int val = list.getFirst();
        list.removeFirst();
        return val;
    }

    public int front() 
    {
        if (list.size() == 0) 
        {
            System.out.println("Queue underflow");
            return -1;
        }
        return list.getFirst();
    }

    public int size() 
    {
        return list.size();
    }
}
