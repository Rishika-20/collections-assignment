package com.knoldus.questioneleven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedListImplementations {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("Rishika");
        listOfStrings.add("Nadra");
        listOfStrings.add("Riya");
        listOfStrings.add("Jasleen");
        listOfStrings.add("Anshika");

        System.out.println("Original list is: "+listOfStrings);

        Collections.fill(listOfStrings, "Rishika");
        System.out.println("After adding Rishika as an object:"+listOfStrings);
    }
}
