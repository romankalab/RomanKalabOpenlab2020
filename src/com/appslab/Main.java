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

        for (int i = 0; i<numberCount; i++)
        {
            System.out.print("Enter number: ");
            numbers.add(input.nextInt());
        }

        int x = 0;
        for (Integer number : numbers)
        {
            if(x < numberCount - 1)
            {
                number = number * numberCount;
                System.out.print(number + ", ");
            }
            else
            {
                number = number * numberCount;
                System.out.print(number);
            }
            x++;
        }
    }
}