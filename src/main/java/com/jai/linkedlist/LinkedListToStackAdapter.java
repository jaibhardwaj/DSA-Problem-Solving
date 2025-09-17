package com.jai.linkedlist;

public class LinkedListToStackAdapter 
{
    private MyLinkedList list;

    public LinkedListToStackAdapter() 
    {
        list = new MyLinkedList();
    }

    public int size() 
    {
        return list.size();
    }

    public void push(int val) 
    {
        list.addFirst(val);
    }

    public int pop() 
    {
        if (list.size() == 0) 
        {
            System.out.println("Stack underflow");
            return -1;
        }
        int val = list.getFirst();
        list.removeFirst();
        return val;
    }

    public int top() 
    {
        if (list.size() == 0) 
        {
            System.out.println("Stack underflow");
            return -1;
        }
        return list.getFirst();
    }

}
