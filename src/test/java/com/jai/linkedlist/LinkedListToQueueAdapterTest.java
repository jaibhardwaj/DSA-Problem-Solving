package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListToQueueAdapterTest 
{
    @Test
    void testEnqueueAndFront() 
    {
        LinkedListToQueueAdapter queue = new LinkedListToQueueAdapter();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(10, queue.front());
        assertEquals(3, queue.size());
    }

    @Test
    void testDequeue() 
    {
        LinkedListToQueueAdapter queue = new LinkedListToQueueAdapter();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.front());
        assertEquals(2, queue.size());
    }

    @Test
    void testDequeueUntilEmpty() 
    {
        LinkedListToQueueAdapter queue = new LinkedListToQueueAdapter();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        assertEquals(-1, queue.dequeue()); // underflow
        assertEquals(-1, queue.front()); // underflow
        assertEquals(0, queue.size());
    }

    @Test
    void testSize() 
    {
        LinkedListToQueueAdapter queue = new LinkedListToQueueAdapter();
        assertEquals(0, queue.size());
        queue.enqueue(100);
        assertEquals(1, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
    }
}
