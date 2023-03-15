package com.knoldus.questiontwo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListReplacementWithNewObject {
    public static void main(String[] args) {

        List<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("Rishika");
        listOfStrings.add("Nadra");
        listOfStrings.add("Riya");
        listOfStrings.add("Jasleen");
        listOfStrings.add("Anshika");

        System.out.println("Original list is: "+listOfStrings);

        Collections.fill(listOfStrings, "New Object");

        System.out.println("List after replacement: "+listOfStrings);

    }
}
