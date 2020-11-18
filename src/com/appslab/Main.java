package com.appslab;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person John = new Person("John", 20, 5480);
        Person Steve = new Person("Steve", 22, 6770);
        Person Martin = new Person("Marin", 25, 4590);
        List<Person> people = Arrays.asList(John, Steve, Martin);

        System.out.println(people.stream().anyMatch(person -> person.getName().contains("a")));
    }
}