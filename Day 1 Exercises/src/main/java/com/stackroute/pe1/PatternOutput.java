package com.stackroute.pe1;

import java.util.Scanner;

public class PatternOutput {
    public static void main (String[] args)   {
        int range;
        Scanner input = new Scanner(System.in);

        /* Prompt the user to enter a range */

        System.out.println("Enter the Range: ");
        range = input.nextInt();

        for (byte i = 1; i <= range; i++)    {

            for (byte j = 1; j <= i; j++) {

                /* Printing Patterns */
                System.out.print(i + " "); // Inner for loop ends
            }

        } // Outer for loop ends

    }
}
