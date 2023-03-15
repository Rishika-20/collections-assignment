package com.knoldus.questionseven;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCloning {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(600);

        System.out.println("Original list: "+numbers);
        // Creating another list.
        List<Integer> firstList = new ArrayList<>(numbers);

        // Creating one more list.
        List<Integer> secondList = new ArrayList<>();
        secondList.addAll(numbers);

        System.out.println("List after copied or cloning: "+secondList);
    }
}
