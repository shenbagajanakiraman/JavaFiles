package com.stackroute.pe5;

public class WordCountAndHashMap {
    public static void main(String[] args) {
        String str = "one one -one___two,,three,one @three*one?two ";
        int countOne;
        int countTwo;
        int countThree;

        String strOne[] = str.split("one");
        countOne = strOne.length - 1;

        String strTwo[] = str.split("two");
        countTwo = strTwo.length - 1;

        String strThree[] = str.split("three");
        countThree = strThree.length - 1;

        System.out.println("Entered string : "+str);
        System.out.println(countOne);
        System.out.println(countTwo);
        System.out.println(countThree);


    }
}
