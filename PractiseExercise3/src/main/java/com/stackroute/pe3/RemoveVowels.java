// Program to remove vowel in the String and display it
package com.stackroute.pe3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        int numberOfPlaces;
        System.out.println("Enter the number of places.. ");
        numberOfPlaces = input.nextInt();



            List<Character> al = Arrays.asList(vowels);

            StringBuffer[] sb = new StringBuffer[numberOfPlaces];

            for ( int k =0 ;k < numberOfPlaces ; k++) {
                System.out.println("Enter "+(k+1)+" String");
                sb[k] = new StringBuffer(input.next());

                for (int i = 0; i < sb[k].length(); i++) {

                    if (al.contains(sb[k].charAt(i))) {
                        sb[k].replace(i, i + 1, "");
                        i--;
                    }
                }
            }

        System.out.println("Printing Places , excluding vowels...");

        for ( int k =0 ;k < numberOfPlaces ; k++) {

            System.out.println(sb[k].toString());



        }



    }
}

//
//    static String remVowel(String str)
//    {
//        return str.replaceAll("[aeiouAEIOU]", "");
//    }
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
//        System.out.println(remVowel(str));
//    }
//}
