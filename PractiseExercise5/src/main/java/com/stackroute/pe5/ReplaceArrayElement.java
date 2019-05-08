package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceArrayElement {
    public static void main(String[] args) {

        ArrayList <String> fruitArray = new ArrayList<>();
        fruitArray.add("Apple");
        fruitArray.add("Grape");
        fruitArray.add("Melon");
        fruitArray.add("Berry");
        fruitArray.add("Apple");

        System.out.println("Input : "+fruitArray);
        System.out.println("Changing 'Apple' to 'Kiwi'");




        while (fruitArray.indexOf("Apple") >= 0) {
            fruitArray.set(fruitArray.indexOf("Apple"), "Kiwi");
        }

        System.out.println("Output : "+fruitArray);

        System.out.print("After clearing the List....");
        fruitArray.clear();
        System.out.println(fruitArray);

    }
}
