package com.appslab;

import com.appslab.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    public void getTotalSalary(List<Employee> employments) {
        System.out.println(employments.stream().mapToDouble(Employee::getSalary).sum());
    }
    public void getTotalBonus(List<Employee> employments) {
        System.out.println(employments.stream().mapToInt(Employee::getBonus).sum());
    }
}
