package com.appslab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.println(numbers.stream().map(number -> number * numbers.size()).collect(Collectors.toList()));
    }
}