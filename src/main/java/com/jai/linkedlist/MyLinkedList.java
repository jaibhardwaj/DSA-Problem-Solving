package com.jai.linkedlist;

public class MyLinkedList 
{
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int val)
    {
        Node node = new Node();
        node.data = val;

        if( size == 0 )
        {
            head = tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int size()
    {
        return size;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while( temp != null )
        {
            sb.append(temp.data).append(" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public void removeFirst()
    {
        if( size == 0 )
        {
            System.out.println("List is empty");
            return;
        }
        else if( size == 1 )
        {
            head = tail = null;
            size = 0;
            return;
        }
        else
        {
            head = head.next;
            size--;
        }
    }
    
    public int getFirst()
    {
        if( size == 0 )
        {
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }

    public int getLast()
    {
        if( size == 0 )
        {
            System.out.println("List is empty");
            return -1;
        }
        return tail.data;
    }

    public int getAt(int idx)
    {
        if( size == 0 )
        {
            System.out.println("List is empty");
            return -1;
        }
        else if( idx < 0 || idx >= size )
        {
            System.out.println("Invalid arguments");
            return -1;
        }
        else
        {
            Node temp = head;
            for( int i = 0; i < idx; i++ )
            {
                temp = temp.next;
            }
            return temp.data;
        }
    }
    
    private static class Node
    {
        int data;
        Node next;
    }
}
