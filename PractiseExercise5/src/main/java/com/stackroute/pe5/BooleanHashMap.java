package com.stackroute.pe5;

import java.util.*;

public class BooleanHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String...");
        String string = input.nextLine();
        List<String> stringList;
        stringList = Arrays.asList(string.split(""));
        System.out.println(stringList);

        Map<String, Boolean > stringHashMap = new HashMap<>();

        for(String word : stringList) {
            if(stringHashMap.containsKey(word))
            {
                stringHashMap.replace(word, true);
            }
            else {
                stringHashMap.put(word,false);
            }

        }

        System.out.println(stringHashMap);



}
}
