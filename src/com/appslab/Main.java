package com.appslab;

import com.appslab.model.Driver;
import com.appslab.model.Employee;
import com.appslab.model.Programmer;
import com.appslab.model.Teacher;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer(1254, 65);
        Teacher teacher = new Teacher(854, 36);
        Driver driver = new Driver(750, 41);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        List<Employee> employees = Arrays.asList(programmer, teacher, driver);
        employees.forEach(Employee::getInfo);
        employeeService.getTotalSalary(employees);
        employeeService.getTotalBonus(employees);
    }
}
