package com.stackroute.pe1;

import java.util.Scanner;

public class ReverseString {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        String str;
        String rev= "";

        /* Prompt the user to enter a string */
        System.out.println("Enter a String");
        str = input.nextLine();

        /* Code to reverse the string */
        for (int i = str.length()-1; i >= 0; i-- ) {
            rev = rev + str.charAt(i);

        }

        /* Print the reversed string */
        System.out.println("The Reversed string is... "+rev);


    }

}


        /*
         Inverting Using StringBuffer class...
        System.out.print("Reversing using StringBuffer class...");
        StringBuffer a = new StringBuffer(str);
        System.out.print(a.reverse());
        */
