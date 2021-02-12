package com.example.learnjava;

public class LinkedListNode {
    int data;

    LinkedListNode next;


    public LinkedListNode(int data, LinkedListNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    public LinkedListNode getNext() {
        return next;
    }

    public void setNextNode(LinkedListNode next) {
        this.next = next;
    }

}
