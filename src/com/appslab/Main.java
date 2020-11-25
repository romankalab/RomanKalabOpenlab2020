package com.appslab;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer(1254, 65);
        Teacher teacher = new Teacher(854, 36);
        Driver driver = new Driver(750, 41);
        List<Employee> employees = Arrays.asList(programmer, teacher, driver);
        employees.forEach(Employee::getInfo);
    }
}
