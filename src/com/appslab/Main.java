package com.appslab;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        double area;
        int perimeter;

        area = areaCheck(triangle.getSideA(), triangle.getSideB(), triangle.getSideC());
        perimeter = perimeterCheck(triangle.getSideA(), triangle.getSideB(), triangle.getSideC());

        System.out.println("Area: " + area);
        System.out.print("Perimeter: " + perimeter);
    }
    public static double areaCheck(int sideA, int sideB, int sideC)
    {
        double s = (sideA + sideB + sideC);
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
    public static int perimeterCheck(int sideA, int sideB, int sideC)
    {
        return sideA + sideB + sideC;
    }
}