package com.knoldus.questionthirteen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MinimumElementInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(50);
        numbers.add(20);
        numbers.add(150);
        numbers.add(250);

        System.out.println("Minimum element in the list is: "+ Collections.min(numbers));
    }
}
