package com.stackroute.pe1;

import java.util.Scanner;

public class PalindromeAndSum {

    public static void main (String[] args) {

        int number; // user - defined
        int temp;
        int revnumber = 0;
        int remainder;
        int sum = 0;
        int temp1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");

        number = input.nextInt();

        temp1 = number;

        while(temp1 != 0) {

            remainder = temp1 % 10;  // Find the last digit
            revnumber = ( revnumber * 10 ) + remainder; // To reverse the number
            temp1 = temp1 / 10;

            if( remainder % 2 == 0) {
                sum = sum + remainder;  // Add sum if the digit is even
            }
        }

        
        if( number == revnumber)   {
            if(sum < 25) {
                System.out.println(number + " is a palindrome and the sum of even numbers is lesser than 25 ");
            }
            else {
                System.out.println(number + " is a palindrome and the sum of even numbers is greater than 25");
            }
        }

        else   {
            System.out.println(number+" is not a palindrome");
        }

    }









}
