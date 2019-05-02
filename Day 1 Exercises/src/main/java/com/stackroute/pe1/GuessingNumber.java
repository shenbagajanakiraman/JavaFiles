package com.stackroute.pe1;

import java.util.Scanner;

public class GuessingNumber {

    public static void main ( String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 30;
        int guess;


        while(true) {

            /* Prompt the user to guess a number, specifying the range */
            System.out.println("Guess my number (1-100): ");
            guess = input.nextInt();

            if(guess == number){
                /* If the guessed number is correct, print Congradulations */
                System.out.println("Congratulations !!! You've guessed it right... "+number+" Right");
                break;

            }

            /* If the guessed number is lesser, say it is lesser*/

            else if (guess < number){
                System.out.println(" Guessed Number is Lesser");

            }

            /* If the guessed number is greater, say it is greater*/

            else {
                System.out.println("Guessed Number is greater");
            }
        } // Continue to loop until the guessed number is same as the original number


    }
}
