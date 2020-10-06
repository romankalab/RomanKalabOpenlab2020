package com.appslab;

public class Student
{
    private String name;
    private int studentNumber;
    private int phoneNumber;
    private String address;

    public Student(String name, int studentNumber, int phoneNumber, String address)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + ", " + studentNumber + ", " + phoneNumber + ", " + address;
    }
}
