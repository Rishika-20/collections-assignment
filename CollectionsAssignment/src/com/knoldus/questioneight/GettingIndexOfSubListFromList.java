package com.knoldus.questioneight;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GettingIndexOfSubListFromList {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>(Arrays.asList("Germany","India","USA","Brazil","China"));

        // Creating a Sub-List
        List<String> commonCountries = new ArrayList<>(Arrays.asList("India","USA"));

        //Getting the first and last indices of the sub-list
        int firstIndex = countries.indexOf((commonCountries.get(0)));
        int lastIndex = countries.indexOf((commonCountries.size()-1))+1;

        //printing the list and the sub-list's indices.
        System.out.println("Original List: " + countries);
        System.out.println("Sub-List: " + commonCountries);
        System.out.println("Starting index of Sub-List in Original List: " + firstIndex);
        System.out.println("Ending index of Sub-List in Original List: " + lastIndex);

    }
}
