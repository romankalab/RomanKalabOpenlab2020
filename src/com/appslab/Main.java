package com.appslab;

public class Main
{

    public static void main(String[] args)
    {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "John";
        student1.studentNumber = 2;
        student1.phoneNumber = 123456;
        student1.address = "Legionarska 1, 01001 Zilina";

        student2.name = "Sam";
        student2.studentNumber = 5;
        student2.phoneNumber = 456789;
        student2.address = "Legionarska 2, 01001 Zilina";

        System.out.println(student1.name + ", " + student1.studentNumber + ", " + student1.phoneNumber + ", " + student1.address);
        System.out.print(student2.name + ", " + student2.studentNumber + ", " + student2.phoneNumber + ", " + student2.address);
    }
}
