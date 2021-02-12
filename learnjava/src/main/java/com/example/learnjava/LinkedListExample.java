package com.example.learnjava;

import sun.awt.image.ImageWatched;

public class LinkedListExample {

    public LinkedListNode MakeLinkedList()
    {
        LinkedListNode three = new LinkedListNode(3, null);
        LinkedListNode two = new LinkedListNode(2, three);
        LinkedListNode one = new LinkedListNode(1, two);

        return one;

    }

    public LinkedListNode SearchLinkedList(LinkedListNode list, int value)
    {

        while (list != null) {
            if (list.getData() == value) {
                return list;
            }
            list = list.getNext();
        }

        return null;


    }

    public void PrintLinkedList(LinkedListNode list) {

        while (list != null) {
            System.out.println(list.getData());
            list = list.getNext();
        }
    }

    public void TestLinkedList() {
        LinkedListNode oneTwoThree = this.MakeLinkedList();
        PrintLinkedList(oneTwoThree);
        LinkedListNode foundNode = SearchLinkedList(oneTwoThree,5);
        if (foundNode == null) {
            System.out.println("Not found!");
        }
        else {
            System.out.println(foundNode.getData());
        }
    }


}
