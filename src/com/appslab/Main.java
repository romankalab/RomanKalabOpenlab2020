package com.appslab;

public class Main
{

    public static void main(String[] args)
    {
        Student student1 = new Student("John", 2, 123456, "Legionarska 1, 01001 Zilina");
        Student student2 = new Student("Sam", 5, 456789, "Legionarska 2, 01001 Zilina");


        System.out.println(student1.toString());
        System.out.print(student2.getName() + ", " + student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
    }
}
