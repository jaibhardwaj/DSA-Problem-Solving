package com.jai.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListToStackAdapterTest 
{
    @Test
    void testPushAndTop() 
    {
        LinkedListToStackAdapter stack = new LinkedListToStackAdapter();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.top());
        assertEquals(3, stack.size());
    }

    @Test
    void testPop() 
    {
        LinkedListToStackAdapter stack = new LinkedListToStackAdapter();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.top());
        assertEquals(2, stack.size());
    }

    @Test
    void testPopUntilEmpty() 
    {
        LinkedListToStackAdapter stack = new LinkedListToStackAdapter();
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        assertEquals(-1, stack.pop()); // underflow
        assertEquals(-1, stack.top()); // underflow
        assertEquals(0, stack.size());
    }

    @Test
    void testSize() 
    {
        LinkedListToStackAdapter stack = new LinkedListToStackAdapter();
        assertEquals(0, stack.size());
        stack.push(100);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }
}
