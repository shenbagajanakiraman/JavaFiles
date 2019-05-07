package com.stackroute.pe4;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);
        String str;
        System.out.println(" Enter a String... ");
        str = input.nextLine();

        String newString;
        newString = str.replaceAll("d", "f").replaceAll("l", "t");

        System.out.println("Original String : "+str);

        System.out.println("New String : "+newString);
    }
}
