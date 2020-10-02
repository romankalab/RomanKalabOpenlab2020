package com.appslab;
import  java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String word;
        boolean isItPalindrome;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        word = input.nextLine();

        char[] wordToChars = word.toCharArray();

    }
    public static boolean palindromeIdentify(String word, char[] wordToChars)
    {
        int i = 0;
        int x = 0;
        for (Character character : wordToChars)
            i++;
        if (i % 2 == 0)
        {
            i++; // +1 gives real amount of chars in array
            String firstHalf = new String();
            char addChar;
            for (i = i / 2; i >= 0; i--)
            {
                addChar = wordToChars[x];
                firstHalf = firstHalf + addChar;
                x++;
            }

        }
        return true;
    }
}
