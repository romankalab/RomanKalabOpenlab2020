package com.appslab;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int numberCount;

        System.out.print("How many numbers do you want to enter: ");
        numberCount = input.nextInt();

        for (int index = 0; index<numberCount; index++)
        {
            System.out.print("Enter number: ");
            numbers.add(input.nextInt());
        }
        for (Integer number : numbers)
        {
            number = number * numberCount;
            System.out.print(number + " ");
        }
    }
}