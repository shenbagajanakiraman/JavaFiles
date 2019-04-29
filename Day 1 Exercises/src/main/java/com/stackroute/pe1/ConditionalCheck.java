package com.stackroute.pe1;

import java.util.Scanner;

public class ConditionalCheck {
    public static void main (String[] args)    {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.println("Enter a number: ");
        number = input.nextInt();

        if((number > 20) && (number < 30 ))      {

            if (number % 2 == 1 ) {
                System.out.println("Tom"); // If odd, Print Tom
            }
            else {
                System.out.println("Jerry"); // If even, Print Jerry
            }

        }

        else {

            System.out.println("Neither Tom nor Jerry !!!");
        }
    }
}
