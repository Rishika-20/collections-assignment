package com.knoldus.questionfive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SwappingOfElementsUsingArrayList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("Brazil");
        countries.add("China");
        countries.add("Germany");

        System.out.println("List before swapping: "+countries);

        // Swapping operation.
        Collections.swap(countries,4,1);

        System.out.println("List after swapping: "+countries);
    }
}
