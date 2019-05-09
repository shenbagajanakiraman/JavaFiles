package com.stackroute.pe5;

import java.util.*;

public class CountWordHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String...");
        String string = input.nextLine();
        List<String> stringList;
        stringList = Arrays.asList(string.split("[^a-zA-Z]+"));

        Map<String, Integer> stringHashMap = new HashMap<>();

        for(String word : stringList) {
            if(stringHashMap.containsKey(word))
            {
                stringHashMap.replace(word, stringHashMap.get(word)+1);
            }
            else {
                stringHashMap.put(word,1);
            }

        }

        System.out.println(stringHashMap);

    }
}

