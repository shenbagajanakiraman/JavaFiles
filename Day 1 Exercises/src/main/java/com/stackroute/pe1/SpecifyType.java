package com.stackroute.pe1;

import java.util.Scanner;

public class SpecifyType {
    public static void main (String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Single character: ");
        ch = input.next().charAt(0);       // Get input from User

        /* Check with the ASCII value of the character and print the character type accordingly */

        if( (ch >= 97 ) && (ch <= 122)) {
            System.out.println("Small letter");
        }

        else if ( (ch >= 65 ) && (ch <= 90)) {
            System.out.println("Capital letter");
        }

        else if ( (ch <= 57 ) && (ch >= 48)) {
            System.out.println("Number");
        }

        /* Everything else other than what is mentioned above are special characters */

        else {

            System.out.println(" Special Character");
        }



    }
}
