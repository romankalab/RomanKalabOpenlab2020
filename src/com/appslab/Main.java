package com.appslab;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("Jack", 20, 5480),
                new Person("Sam", 22, 6770),
                new Person("Dan", 25, 4590),
                new Person("Josh", 19, 3550),
        };
        int sum = 0;
        for(Person person : people)
        {
            sum = sum + person.getBudget();
        }
        System.out.print(sum);
    }
}