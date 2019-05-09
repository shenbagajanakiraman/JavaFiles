package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplaceArrayElement {
    public static void main(String[] args) {

        ArrayList <String> fruitArray = new ArrayList<>();
        fruitArray.add("Apple");
        fruitArray.add("Grape");
        fruitArray.add("Mango");
        fruitArray.add("Orange");
        fruitArray.add("Mango");
        fruitArray.add("Apple");
        fruitArray.add("Lemon");


        System.out.println("Input : "+fruitArray);
        System.out.println("Changing 'Apple' to 'Kiwi' and 'Mango' to 'Melon'");



        while (fruitArray.indexOf("Apple") >= 0) {
            fruitArray.set(fruitArray.indexOf("Apple"), "Kiwi");
        }


        while (fruitArray.indexOf("Mango") >= 0) {
            fruitArray.set(fruitArray.indexOf("Mango"), "Melon");
        }

        System.out.println("Output : "+fruitArray);

        System.out.print("After clearing the List....");
        fruitArray.clear();
        System.out.println(fruitArray);

    }
}
