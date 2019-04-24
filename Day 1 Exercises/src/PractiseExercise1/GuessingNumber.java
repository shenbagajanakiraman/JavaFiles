package PractiseExercise1;

import java.util.Scanner;

public class GuessingNumber {

    public static void main ( String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 50;
        int guess;


        while(true) {
            System.out.println("Guess my number (Range 1-50): ");
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
