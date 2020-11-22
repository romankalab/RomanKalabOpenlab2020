package com.appslab;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(1254, 65);
        Teacher teacher = new Teacher(854, 36);
        programmer.getInfo();
        teacher.getInfo();
    }
}
