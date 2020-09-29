package com.appslab;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner inputMemory = new Scanner(System.in);
        int towerHeigth;
        int stairHeigth;
        int stairLength;
        int distance;
        System.out.print("Tower heigth in cm: ");
        towerHeigth = inputMemory.nextInt();
        System.out.print("Stair heigth in cm: ");
        stairHeigth = inputMemory.nextInt();
        System.out.print("Stair length in cm: ");
        stairLength = inputMemory.nextInt();


        distance = solving(towerHeigth, stairHeigth, stairLength);

        System.out.println();
        System.out.print("Snail must pass " + distance + " cm to reach the top of the tower.");


    }

    public static int solving(int towerHeigth, int stairHeigth, int stairLength)
    {
        int solvedProblem = (towerHeigth / stairHeigth) * stairLength;
        return solvedProblem;
    }
}