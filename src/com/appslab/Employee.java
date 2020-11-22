package com.appslab;

public class Employee {
    protected float salary;
    protected int bonus;
    protected enum Employment {
        Programmer,
        Teacher,
        Driver
    }

    public Employee(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
}
