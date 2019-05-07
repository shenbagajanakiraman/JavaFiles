package com.stackroute.pe4;

import java.util.Scanner;

public class StringTranspose {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);

        String str;
        System.out.println(" Enter a String... ");
        str = input.nextLine();

        StringBuilder string = new StringBuilder();
        string.append(str);

        System.out.println("Entered String : "+str);
        System.out.println("Reversed String : "+string.reverse());

    }
}
