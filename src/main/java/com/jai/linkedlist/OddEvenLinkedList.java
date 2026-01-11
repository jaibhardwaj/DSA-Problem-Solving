package com.jai.linkedlist;

public class OddEvenLinkedList
{

    public static void oddEvenList(MyLinkedList list)
    {
        MyLinkedList oddEvenList = new MyLinkedList();

		while( list.size() > 0 )
		{
			int val = list.getFirst();
			list.removeFirst();
			if( val % 2 == 0 ) {
				oddEvenList.addLast(val);
			}
			else {
				oddEvenList.addFirst(val);
			}
		}

		list.head = oddEvenList.head;
		list.tail = oddEvenList.tail;
		list.size = oddEvenList.size;
    }
}
