package com.appslab;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int totalSlices;
        int numberOfRecipients;
        int slicesEach;
        boolean equality;
        Scanner input = new Scanner(System.in);

        System.out.print("Total slices: ");
        totalSlices = input.nextInt();
        System.out.print("Number of recipients: ");
        numberOfRecipients = input.nextInt();
        System.out.print("Slices each: ");
        slicesEach = input.nextInt();

        equality = equalSlices(totalSlices, numberOfRecipients, slicesEach);

        System.out.println();

        if (equality)
        {
            if (slicesEach >= 1)
            {
                if (slicesEach == 1)
                    System.out.print("Everyone can get " + slicesEach + " slice.");
                else
                {
                    System.out.print("Everyone can get " + slicesEach + " slices.");
                }
            }
            else
            {
                System.out.print("No one gets nothing.");
            }
        }
        else
        {
            if (slicesEach >= 1)
            {
                if (slicesEach == 1)
                    System.out.print("Not everyone can get " + slicesEach + " slice.");
                else
                {
                    System.out.print("Not everyone can get " + slicesEach + " slices.");
                }
            }
            else
            {
                System.out.print("No one gets nothing.");
            }
        }



    }
    public static boolean equalSlices(int totalSlices, int numberOfRecipients, int slicesEach)
    {
        return numberOfRecipients * slicesEach <= totalSlices;
    }
}
