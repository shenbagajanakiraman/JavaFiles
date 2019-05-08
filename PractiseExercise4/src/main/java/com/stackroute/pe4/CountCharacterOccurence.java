package com.stackroute.pe4;

import java.util.Scanner;

public class CountCharacterOccurence {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);

        String str;
        System.out.println(" Enter a String... ");
        str = input.nextLine();

        String ch;
        System.out.println(" Enter a Pattern Character... ");
        ch = input.next();

        int length = str.length();
        int charCount = length - str.replaceAll(ch,"").replaceAll("A","").length();

        System.out.println("The character count of "+ch+" in string is... "+charCount);



    }
}
