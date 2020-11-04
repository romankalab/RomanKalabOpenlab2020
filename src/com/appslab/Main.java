package com.appslab;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        for (int x : list)
        {
            System.out.print(x + ", ");
        }
    }
}
