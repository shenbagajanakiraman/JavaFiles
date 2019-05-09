package com.stackroute.pe5;

import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ReshWordCountLogic {
    public static void main(String[] args) {
        String str = "one one -one___two,,three,one @three*one?two";
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;


        StringTokenizer t = new StringTokenizer(str," ,@_*?");


        ArrayList<String> words = new  ArrayList<String>();

        while (t.hasMoreTokens()) {
            words.add(t.nextToken());

        }



        for( String sample : words)
        {
            if (sample.contains("one") ) {
                countOne++;
            }

            if (sample.contains("two") ) {
                countTwo++;
            }
            if (sample.contains("three") ) {
                countThree++;
            }

        }
        System.out.println("Entered string : "+str);

        System.out.println("\nPrinting Using HashMap...");
        Map<String,Integer> countString = new HashMap<String,Integer>();

        countString.put("one",countOne);
        countString.put("two",countTwo);
        countString.put("three",countThree);

        System.out.println(countString);




    }
}
