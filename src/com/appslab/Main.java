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

        isItPalindrome = palindromeIdentify(wordToChars);

        System.out.println();
        if (isItPalindrome)
        {
            System.out.print("Word " + word + " is a palindrome.");
        }
        else
        {
            System.out.print("Word " + word + " isn't a palindrome.");
        }

    }
    public static boolean palindromeIdentify(char[] wordToChars)
    {
        int i = 0;
        int x1 = 0;
        int x2;
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        char addChar1;
        char addChar2;
        for (Character character : wordToChars)
            i++;
        if (i % 2 == 0)
        {
            i++; // +1 gives real amount of chars in array
            x2 = i - 2;
            for (i = i / 2; i >= 0; i--)
            {
                addChar1 = wordToChars[x1];
                addChar2 = wordToChars[x2];
                firstHalf.append(addChar1);
                secondHalf.append(addChar2);
                x1++;
                x2--;
            }
            return firstHalf.toString().equals(secondHalf.toString());

        }
        else
        {
            i++; // +1 gives real amount of chars in array
            x2 = i - 2;
            for (i = (i - 1) / 2; i >= 0; i--)
            {
                addChar1 = wordToChars[x1];
                addChar2 = wordToChars[x2];
                firstHalf.append(addChar1);
                secondHalf.append(addChar2);
                x1++;
                x2--;
            }
            return firstHalf.toString().equals(secondHalf.toString());
        }
    }
}
