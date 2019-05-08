package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] srgs) {

        boolean flag;

        System.out.println("Enter a String...");

        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();

        System.out.println("Enter a Pattern String...");

        String patternString;
        patternString = input.nextLine();


        if(str.contains(patternString)) {
            flag = true;
        }
        else {
            flag = false;
        }

        System.out.println("String ..."+str);
        System.out.println("Is "+patternString+" here ? "+flag+  "  : Case sensitive");


        System.out.println("\n\nUsing Pattern and Matcher...");



        Pattern pattern=Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            System.out.println( str+ " Contains "+patternString + "  : Case insensitive");

        }


    }
}
