package com.appslab;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person Jack = new Person("Jack", 20, 5480);
        Person Sam = new Person("Sam", 22, 6770);
        Person Dan = new Person("Dan", 25, 4590);
        Person Josh = new Person("Josh", 19, 3550);
        List<Person> people = Arrays.asList(Jack, Sam, Dan, Josh);

        System.out.println(people.stream().mapToInt(Person::getBudget).sum());

        // int sum = 0;
        // for(Person person : people)
        // {
        //    sum = sum + person.getBudget();
        // }
        // System.out.print(sum);
    }
}