package com.appslab;

public class Programmer {
    private float salary;
    private int bonus;

    public Programmer(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public void getInfo() {
        System.out.println("Teacher's salary is " + salary + " and bonus is" + bonus + ".");
    }
}
