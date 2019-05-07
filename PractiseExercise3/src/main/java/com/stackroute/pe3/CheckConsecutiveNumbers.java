/* Program to check whether the numbers given are consecutive or not... */
package com.stackroute.pe3;

import java.util.Scanner;

public class CheckConsecutiveNumbers {
    public static void main(String[] args) {
        String numbers;
        String str[];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers, separated by comma...");
        numbers = input.next();

        str = numbers.split(",");
        int length = str.length;

        int[] num = new int[length];
        int i = -1;
        boolean flag = false;
        boolean inc = false;
        boolean dec = false;

        for (String st : str) {
            num[++i] = Integer.parseInt(st);
        }


        for ( int k = 0; k < length-1 ;k++) {
            if (num[k]+1 == num [k+1]) {
                inc = true;
                if (dec) {
                    flag = false;
                    break;

                }
                flag = true;
            }
                 if (num[k]-1 == num [k+1]){
                    dec = true;
                    if (inc) {
                        flag = false;
                        break;


                }
                    flag = true;

                }

        }


        System.out.println("\n"+numbers);
        if(flag)
            System.out.println("They are consecutive numbers...");
        else
            System.out.println("They are non - consecutive numbers");

    }
}
