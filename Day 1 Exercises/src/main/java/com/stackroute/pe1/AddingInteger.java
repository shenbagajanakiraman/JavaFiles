package com.stackroute.pe1;

import java.util.Scanner;

public class AddingInteger {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        /* Prompt user to enter some input */

        System.out.println("Enter a few numbers (Press 0 find Sum) : ");

        double number; // user input data type

        int sum = 0; // Initialise sum to 0

        /* Grt input from user and check if it is an integer
        if yes, sum the number */

        while ((number = input.nextDouble()) != 0) {
            if (number == (int) number) {
                sum = sum + (int)number;
            }

            else {
                System.out.println("Error "+number+ " is not an integer");
                /* set flag = false if the number is not an integer */
                flag = false;
                break;
            }

            }

           /* Print sum if the numbers are integers (true) */

        if (flag) {
            System.out.println("The Sum is ..."+sum);
        }
    }
}
