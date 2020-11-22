package com.appslab;

public class Teacher extends Employee {
    Employment employment = Employment.Teacher;

    public Teacher(float salary, int bonus) {
        super(salary, bonus);
    }
    public void getInfo() {
        System.out.println(employment + "'s" + " salary is " + salary + " and bonus is " + bonus + ".");
    }
}
