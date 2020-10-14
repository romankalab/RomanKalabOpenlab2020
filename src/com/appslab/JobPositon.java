package com.appslab;

public class JobPositon {
    private String name;
    private double salary;

    public JobPositon(String name, double salary)  {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
