package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        list.forEach(number -> {if (number % 2 == 1) oddNumbers.add(number);});
        list = oddNumbers;
        list.forEach(System.out::println);

    }
}
