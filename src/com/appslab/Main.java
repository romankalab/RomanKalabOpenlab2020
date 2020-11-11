package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.removeIf(number -> number % 2 == 0);
        list.forEach(System.out::println);

    }
}
