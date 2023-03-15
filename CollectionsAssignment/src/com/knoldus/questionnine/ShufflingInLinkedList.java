package com.knoldus.questionnine;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ShufflingInLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add( 1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // shuffle the linked list
        Collections.shuffle(linkedList);

        // print the shuffled linked list
        System.out.println("Linked List after shuffling: " + linkedList);
    }
}
