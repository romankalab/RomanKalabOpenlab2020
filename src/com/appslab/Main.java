package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.removeIf(number -> number % 2 == 0);
        list.forEach(System.out::println);

        // list = list.stream().filter(number -> number % 2 == 1).collect(Collectors.toList());

    }
}
