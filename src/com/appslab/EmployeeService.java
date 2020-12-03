package com.appslab;

import com.appslab.model.Employee;

import java.util.List;

public interface EmployeeService {
    void getTotalSalary(List<Employee> employments);
    void getTotalBonus(List<Employee> employments);
}
