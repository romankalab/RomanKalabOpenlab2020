package com.appslab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String memory1;
        String memory2;
        int result;

        System.out.print("rock, paper, scissors");
        System.out.println();
        System.out.print("Player1: ");
        memory1 = input.nextLine();
        System.out.print("Player2: ");
        memory2 = input.nextLine();

        result = rpsGame(memory1, memory2);

        System.out.println();
        if (result == 0)
            System.out.print("TIE.");
        if (result == 1)
            System.out.print("Player1 wins.");
        if (result == 2)
            System.out.print("Player2 wins.");
        if (result == 3)
            System.out.print("An error occurred.");
    }
    public static int rpsGame(String memory1, String memory2)
    {
        if (memory1.equals("rock"))
        {
            if (memory2.equals("rock"))
                return 0;
            if (memory2.equals("paper"))
                return 2;
            if (memory2.equals("scissors"))
                return 1;
        }
        if (memory1.equals("paper"))
        {
            if (memory2.equals("rock"))
                return 1;
            if (memory2.equals("paper"))
                return 0;
            if (memory2.equals("scissors"))
                return 2;
        }
        if (memory1.equals("scissors"))
        {
            if (memory2.equals("rock"))
                return 2;
            if (memory2.equals("paper"))
                return 1;
            if (memory2.equals("scissors"))
                return 0;
        }
        return 3;
    }
}