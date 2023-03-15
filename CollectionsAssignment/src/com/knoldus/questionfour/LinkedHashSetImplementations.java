package com.knoldus.questionfour;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSetImplementations {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(100);
        integerSet.add(200);
        integerSet.add(300);
        integerSet.add(400);
        integerSet.add(500);
        integerSet.add(600);

        System.out.println("Original Set: "+integerSet);
        integerSet.remove(500);

        System.out.println("Set after removing the element(500) is:  "+integerSet);

    }
}
