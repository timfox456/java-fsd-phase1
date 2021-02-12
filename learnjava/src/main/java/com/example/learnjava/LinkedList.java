package com.example.learnjava;

import sun.awt.image.ImageWatched;

public class LinkedList {

    LinkedListNode head;
    LinkedListNode tail;
    int tailPosition = 0;

    public void Append(int value) {
        tail.setNextNode(new LinkedListNode(value, null));
    }

    public LinkedListNode Dequeue() {
        LinkedListNode dequeuedItem = head;
        head = head.getNext();
        return dequeuedItem;
    }



    public void InsertAtPosition(int value, int position) {

        //TODO: Handle insertion at the head and tail
        //TODO: Handle head == tail == null
        LinkedListNode current = head;
        int currentPos = 0;
        while(currentPos < (position - 1) ) {
            current = current.getNext();
            currentPos++;
        }

        LinkedListNode newNode = new LinkedListNode(value, current.getNext());
        current.setNextNode(newNode);


    }

}
