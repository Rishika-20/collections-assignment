package com.knoldus.questionone;

import java.util.LinkedList;

public class LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Rishika");
        linkedList.add("Nadra");
        linkedList.add("Riya");
        linkedList.add("Jasleen");
        linkedList.add("Anshika");

        // converting list to an array.
        String[] array = linkedList.toArray(new String[0]);

        //printing the result.
        for(String name : linkedList)
        {
            System.out.println(name);
        }

    }
}
