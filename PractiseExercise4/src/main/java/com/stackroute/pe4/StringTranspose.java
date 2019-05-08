package com.stackroute.pe4;


import java.util.Scanner;

public class StringTranspose {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);

        String str;
        System.out.println(" Enter a String... ");
        str = input.nextLine();

        StringBuilder finalSentence = new StringBuilder();



        String strArr[] = str.split(" ");


        for (String words : strArr) {

            StringBuilder word = new StringBuilder();
            word.append(words);
            word.reverse();
            finalSentence.append(word+" ");

        }

        System.out.println("Entered String : "+str);
        System.out.println("Reversed String : "+finalSentence);

    }
}
