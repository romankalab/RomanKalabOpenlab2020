package com.appslab;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        boolean answer;
        Scanner memory = new Scanner(System.in);

        System.out.print("Enter first side: ");
        a = memory.nextInt();
        System.out.print("Enter second side: ");
        b = memory.nextInt();
        System.out.print("Enter third side: ");
        c = memory.nextInt();

        answer = isItTriangle(a, b, c);

        System.out.println();
        if(answer)
            System.out.print("This is a triangle.");
        else
            System.out.print("This isn't a triangle.");
    }

    public static boolean isItTriangle(int a, int b, int c)
    {
        if(a + b > c)
        {
            if(b + c > a)
            {
                if(a + c > b)
                    return true;
            }
        }
        return false;
    }
}
