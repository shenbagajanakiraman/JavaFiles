package com.stackroute.pe4;

import java.util.Scanner;

public class RegularExpression {

    public static void main(String[] srgs) {

        boolean flag;

        System.out.println("Enter a String...");

        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();


        if(str.contains("Reshma")) {
            flag = true;
        }
        else {
            flag = false;
        }

        System.out.println("String ..."+str);
        System.out.println("Is Reshma here ? "+flag);

    }
}
