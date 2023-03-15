package com.knoldus.questiontwelve;

import java.util.ArrayList;
import java.util.List;

public class GetELementsOfList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(15);
        myList.add(17);
        myList.add(25);
        myList.add(25);
        myList.add(35);

        System.out.println("First element of list is: "+myList.get(0));
    }
}
