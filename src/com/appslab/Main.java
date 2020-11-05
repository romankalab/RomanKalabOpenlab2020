package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int newElement = 9;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7));
        addIfNotExists(newElement, list);
        list.forEach(System.out::println);
    }
    static void addIfNotExists (int newElement, ArrayList<Integer> list)
    {
        if (!list.contains(newElement))
        {
            list.add(newElement);
        }
    }
}