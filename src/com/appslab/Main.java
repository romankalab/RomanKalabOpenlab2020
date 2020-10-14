package com.appslab;

public class Main {

    public static void main(String[] args) {
        JobPositon employee1JobPosition = new JobPositon("IT programmer", 2100);
        Employee employee1 = new Employee("Jozko", "Mrkvicka", "4.7.1990", employee1JobPosition);

        System.out.print(employee1.getName() + " " + employee1.getSurname() + ", " + employee1.getDateOfBirth() + ", " + employee1.getJobPositon());
    }
}