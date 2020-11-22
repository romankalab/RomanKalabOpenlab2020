package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        Set<Integer> set = new HashSet<>(list);
        set.add(1);
        set.forEach(System.out::println);

        /* if (list.isEmpty())
            System.out.print("The list is empty.");
        else
        list.forEach(System.out::println); */
    }
}