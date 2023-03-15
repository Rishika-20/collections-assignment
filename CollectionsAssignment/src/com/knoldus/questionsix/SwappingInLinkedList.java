package com.knoldus.questionsix;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class SwappingInLinkedList {
    public static void main(String[] args) {
        List<Integer> myList =  new LinkedList<>();
        myList.add(500);
        myList.add(900);
        myList.add(700);
        myList.add(800);
        myList.add(600);

        System.out.println("List before swapping: "+myList);

        // swap operations performed here,
        Collections.swap(myList,0,3);

        System.out.println("List after swapping: "+myList);

    }
}
