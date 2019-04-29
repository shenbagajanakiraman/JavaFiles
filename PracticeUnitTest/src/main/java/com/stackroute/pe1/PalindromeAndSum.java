package com.stackroute.pe1;

import java.util.Scanner;

public class PalindromeAndSum {

    static int number; // user - defined
    static int temp;
    static int revnumber;
    static int remainder;
    static int sum;
    static int temp1;


    public int palindromeCheck(int number) {


        while (number != 0) {

            remainder = number % 10;  // Find the last digit
            revnumber = (revnumber * 10) + remainder; // To reverse the number
            number = number / 10;

        }

        return revnumber;
    }


    protected int sumPalin(int number) {
        while (number != 0) {
            remainder = number % 10;
            if (remainder % 2 == 0) {
                sum = sum + remainder;

            }
            number = number / 10;

        }
        return sum;
    }

}
