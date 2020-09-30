package com.appslab;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner setNumber = new Scanner(System.in);
        int firstValue;
        int secondValue;
        int thirdValue;
        int matchValueCount;

        System.out.print("Enter first number: ");
        firstValue = setNumber.nextInt();
        System.out.print("Enter second number: ");
        secondValue = setNumber.nextInt();
        System.out.print("Enter third number: ");
        thirdValue = setNumber.nextInt();

        matchValueCount = matchIdentify(firstValue, secondValue, thirdValue);
        System.out.println();
        System.out.print("Numbers matching: " + matchValueCount + "/3");


    }

    public static int matchIdentify(int firstValue, int secondValue, int thirdValue)
    {
        int matchingValues = 0;
        if(firstValue == secondValue)
           matchingValues++;
        if(firstValue == thirdValue)
            matchingValues++;
        if(secondValue == thirdValue)
            matchingValues++;

        
        if (matchingValues == 1)
            matchingValues++;


        return matchingValues;
    }
}
