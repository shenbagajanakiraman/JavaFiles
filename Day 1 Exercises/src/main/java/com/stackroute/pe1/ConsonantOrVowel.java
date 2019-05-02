package com.stackroute.pe1;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        /* Prompt the user to enter a string */
        System.out.println("Enter A String: ");

        str = input.nextLine();

        /* Loop until the end of string is reached */

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {

                if((ch == 'a') || (ch == 'e') || (ch == 'i')  ||  (ch == 'o')  || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I')  ||  (ch == 'O')  || (ch == 'U')) {
                    /* Print vowel if the character is vowel */
                    System.out.println(ch+" : is a vowel");

                }

                else {
                    /* Print consonant if the character is consonant */
                    System.out.println(ch+" : is a Consonant");
                }
            }

            else {

                /* Print Error if the character is neither vowel nor consonant */
                System.out.println("Error !!! "+ch+ " is not an alphabet");
            }
        }

    }


}
