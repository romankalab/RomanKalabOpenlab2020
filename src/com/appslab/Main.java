package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        if (list.isEmpty())
            System.out.print("The list is empty.");
        else
        list.forEach(System.out::println);
    }
}
