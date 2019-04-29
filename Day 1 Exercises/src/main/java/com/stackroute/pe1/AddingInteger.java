package com.stackroute.pe1;

import java.util.Scanner;

public class AddingInteger {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Enter a few numbers (Press 0 find Sum) : ");

        double number;

        int sum = 0;

        while ((number = input.nextDouble()) != 0) {
            if (number == (int) number) {
                sum = sum + (int)number;
            }

            else {
                System.out.println("Error "+number+ " is not an integer");
                flag = false;
                break;
            }

            }

           if (flag) {
               System.out.println("The Sum is ..."+sum);
        }
    }
}
