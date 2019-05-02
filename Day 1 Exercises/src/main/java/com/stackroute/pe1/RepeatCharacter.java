package com.stackroute.pe1;

import java.util.Scanner;

public class RepeatCharacter {

    public static void main ( String[] args_) {

        Scanner input = new Scanner(System.in);

        String str;
        String substr;
        int value;
        int stringlen;
        int valueRpt;

        /* Prompt the user to enter a string */

        System.out.println("Enter a String :");
        str = input.next();

        //Prompt the user to enter a small number for generating a pattern
        System.out.println("Enter a small number :");
        value = input.nextInt();

        /* Find out the length of the string */

        stringlen = str.length();
        valueRpt = stringlen-value;
        substr = str.substring(valueRpt);
        System.out.print(str); // Print the string

        /* For the user defined number of times, print the substring */

        for( byte i = 0; i < value ; i++) {
            System.out.print(substr);
        }


    }
}
