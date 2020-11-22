package com.appslab;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(1542, 365);
        Teacher teacher = new Teacher(850, 58);
        programmer.getInfo();
        teacher.getInfo();
    }
}
