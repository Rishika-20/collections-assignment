package com.knoldus.questionsthree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReversing {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(15);
        myList.add(17);
        myList.add(25);
        myList.add(25);
        myList.add(35);

        System.out.println("Original List is: "+myList);

        Collections.reverse(myList);
        System.out.println("List after reverse: "+myList);

    }
}
