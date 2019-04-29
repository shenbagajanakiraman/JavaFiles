package com.stackroute.pe1;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String str;
        System.out.println("Enter A String: ");

        str = input.nextLine();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {

                if((ch == 'a') || (ch == 'e') || (ch == 'i')  ||  (ch == 'o')  || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I')  ||  (ch == 'O')  || (ch == 'U')) {
                    System.out.println(ch+" : is a vowel");

                }

                else {
                    System.out.println(ch+" : is a Consonant");
                }
            }

            else {

            System.out.println("Error !!! "+ch+ " is not an alphabet");
            }
        }

    }


}
