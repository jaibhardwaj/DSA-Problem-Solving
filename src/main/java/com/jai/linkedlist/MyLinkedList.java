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

    public void addFirst(int val)
    {
        Node node = new Node();
        node.data = val;

        if( size == 0 )
        {
            head = tail = node;
        }
        else
        {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addAt(int idx, int val)
    {
        if( idx < 0 || idx > size )
        {
            System.out.println("Invalid arguments");
            return;
        }
        else if( idx == 0 )
        {
            addFirst(val);
        }
        else if( idx == size )
        {
            addLast(val);
        }
        else
        {
            Node node = new Node();
            node.data = val;

            Node temp = head;
            for( int i = 0; i < idx - 1; i++ )
            {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void removeLast()
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
            Node temp = head;
            for( int i = 0; i < size - 2; i++ )
            {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void removeAt(int idx)
    {
        if( idx < 0 || idx >= size )
        {
            System.out.println("Invalid arguments");
            return;
        }
        else if( idx == 0 )
        {
            removeFirst();
        }
        else if( idx == size - 1 )
        {
            removeLast();
        }
        else
        {
            Node temp = head;
            for( int i = 0; i < idx - 1; i++ )
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void reverseDI()
    {
        if( size <= 1 )
        {
            return;
        }

        int left = 0;
        int right = size - 1;

        while( left < right )
        {
            Node leftNode = getNodeAt(left);
            Node rightNode = getNodeAt(right);

            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;

            left++;
            right--;
        }
    }

    public void reversePI()
    {
        if( size <= 1 )
        {
            return;
        }

        Node prev = null;
        Node curr = head;

        while( curr != null )
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Swap head and tail
        Node temp = head;
        head = tail;
        tail = temp;
    }
    
    private Node getNodeAt(int idx)
    {
        if (idx < 0 || idx >= size)
        {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        }
        Node temp = head;
        for (int i = 0; i < idx; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    private static class Node
    {
        int data;
        Node next;
    }
}
