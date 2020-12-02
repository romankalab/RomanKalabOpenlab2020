package com.appslab.model;

import com.appslab.model.Employee;

public class Teacher extends Employee {

    public Teacher(float salary, int bonus) {
        super(salary, bonus, Employment.TEACHER);
    }
}
