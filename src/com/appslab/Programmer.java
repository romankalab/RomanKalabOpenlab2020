package com.appslab;

public class Programmer extends Employee {
    Employment employment = Employment.Programmer;

    public Programmer(float salary, int bonus) {
        super(salary, bonus);
    }

    public void getInfo() {
        System.out.println(employment + "'s" + " salary is " + salary + " and bonus is " + bonus + ".");
    }
}
