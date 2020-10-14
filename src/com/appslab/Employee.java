package com.appslab;

public class Employee {
    private String name;
    private String surname;
    private  String dateOfBirth;
    private JobPositon jobPositon;

    public Employee(String name, String surname, String dateOfBirth, JobPositon jobPositon) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.jobPositon = jobPositon;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getJobPositon() {
        return (jobPositon.getName() + ", " + jobPositon.getSalary());
    }
}
