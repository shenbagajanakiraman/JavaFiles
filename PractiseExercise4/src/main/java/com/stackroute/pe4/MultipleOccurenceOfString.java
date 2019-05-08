package com.stackroute.pe4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceOfString {
    public static void main(String[] srgs) {

        Scanner input = new Scanner(System.in);

        String str;
        String patternString;
        System.out.println(" Enter a String... ");
        str = input.nextLine();

        System.out.println(" Enter a Pattern String... ");
        patternString = input.nextLine();


       StringBuilder stringFinal=new StringBuilder();

        Pattern pattern=Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            stringFinal.append("Found at: ").append(matcher.start()).append("-").append(matcher.end()).append("\n");
        }
        System.out.println( stringFinal);
    }
    }

