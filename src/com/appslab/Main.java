package com.appslab;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        System.out.println(map);
    }
}
