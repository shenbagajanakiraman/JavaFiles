package com.stackroute.pe1;

import java.util.Scanner;

public class ConsonantOrVowel {

    String str;
    String finalStr = "";

    protected String findTypeConsonantOrVowel(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {

                if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                    str = ch + " - Vowel \n";
                }
                else {
                    str = ch + " - Consonant \n";
                }

                finalStr = finalStr + str;


            }
        }

        System.out.println(finalStr);
        return finalStr;


    }
}
