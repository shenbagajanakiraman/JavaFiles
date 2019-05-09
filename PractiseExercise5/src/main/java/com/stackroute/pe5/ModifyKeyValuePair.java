package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModifyKeyValuePair {




    public static void main(String[] args){
        ModifyKeyValuePair valuePair = new ModifyKeyValuePair();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Key value 1 : ");
        String string1 = input.next();

        System.out.println("Enter Key value 1 : ");
        String string2 = input.next();

        HashMap<String,String> myMap = new HashMap<>();
        myMap.put("Val1",string1);
        myMap.put("Val2",string2);

        System.out.println(myMap);

        valuePair.updateKeyValuePair(myMap);

    }

    private void updateKeyValuePair(Map<String, String> myMap) {

        myMap.replace("Val2",myMap.get("Val1"));
        myMap.replace("Val1","\"\"");

        System.out.println("After Updationg...");

        System.out.println(myMap);


    }
}
