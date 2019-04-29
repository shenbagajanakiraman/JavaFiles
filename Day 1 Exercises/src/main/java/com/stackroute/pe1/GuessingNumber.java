package com.stackroute.pe1;

import java.util.Scanner;

public class GuessingNumber {

    public static void main ( String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 30;
        int guess;


        while(true) {
            System.out.println("Guess my number (1-100): ");
            guess = input.nextInt();

            if(guess == number){
                System.out.println("Congratulations !!! You've guessed it right... "+number+" Right");
                break;

            }

            else if (guess < number){
                System.out.println(" Guessed Number is Lesser");

            }

            else {
                System.out.println("Guessed Number is greater");
            }
        }


    }
}
