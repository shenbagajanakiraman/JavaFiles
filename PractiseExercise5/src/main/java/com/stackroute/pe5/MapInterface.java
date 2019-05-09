package com.stackroute.pe5;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TreeSet <String> myTreeSet = new TreeSet<>();

        // Adding elements into the TreeSet
        myTreeSet.add("Reshma");
        myTreeSet.add("Gokul");
        myTreeSet.add("Krishna");
        myTreeSet.add("Arjun");
        myTreeSet.add("Lakshmi");
        myTreeSet.add("Praba");
        myTreeSet.add("Raman");
        myTreeSet.add("Shenbaga");

        //Converting TreeSet into List

        List<String> myList = new ArrayList<>(myTreeSet);


        //Printing the List

        System.out.println(myList);

        //Custom defined input.... (Trial)

        System.out.println("Enter a group of Strings in a single line...");
        String string = input.nextLine();
        List<String> al;
        al = Arrays.asList(string.split("[^a-zA-Z]+"));

        System.out.println("Entered List.....\n"+al);
        System.out.println("Adding list to TreeSet");
        TreeSet <String> TreeSet = new TreeSet<>(al);
        System.out.println("Printing TreeSet...");
        System.out.println(TreeSet);



    }

}
