package com.stackroute.pe1;

import java.util.Scanner;

public class ArrangeNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int length;
        int temp;

        /* Prompt user to enter a number */

        System.out.println("Enter a large number :");
        number = input.nextInt();

        /* finding length of the number */
        int len = Integer.toString(number).length();

        /* Declate an array to store individual numbers */
        int[] numArray = new int[len];
        int k=0;
        int len1;
        int sum = 0;

        len1 = len;

        /* Find the individual numbes and store it in an array */

        while(len>0) {
            numArray[k] = number % 10;
            number = number / 10;

            /* If the number is even, sum it up */
            if ((numArray[k] % 2) == 0) {
                sum = sum + numArray[k];
            }
            k++;
            len--;
        }

        len = len1;

        /* Sort the numbers of an array */

        int temp1;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (numArray[j] > numArray[j - 1]) {
                    temp1 = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = temp1;
                }
            }
        }

        k=0;

        System.out.print("Sorted number in non-increasing order: ");

        while(len>0) {
            System.out.print(numArray[k]);
            len--;
            k++;
        }

        System.out.println("");
        System.out.println("The Sum of even numbers is ... "+sum);

        /* If sum is greater than 15, print true. Otherwise, print false */
        if(sum > 15) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }




    }


}




