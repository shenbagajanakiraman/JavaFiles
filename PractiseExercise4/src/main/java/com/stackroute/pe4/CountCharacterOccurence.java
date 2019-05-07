package com.stackroute.pe4;

import java.util.Scanner;

public class CountCharacterOccurence {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);

        String str;
        System.out.println(" Enter a String... ");
        str = input.nextLine();

        int length = str.length();
        int charCount = length - str.replaceAll("a","").replaceAll("A","").length();

        System.out.println("The character count of 'a' in string is... "+charCount);



    }
}
