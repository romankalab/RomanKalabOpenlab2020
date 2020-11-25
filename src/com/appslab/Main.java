package com.appslab;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        addIfDoesNotExist(map);
        System.out.print(map);
    }
    public static void addIfDoesNotExist(HashMap<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = input.nextLine();
        System.out.print("Enter value: ");
        int value = input.nextInt();
        map.putIfAbsent(key, value);
    }
}
