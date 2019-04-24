package PractiseExercise1;

import java.util.Scanner;

public class ReverseString {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        String str;
        String rev= "";
        System.out.println("Enter a String");
        str = input.nextLine();

        for (int i = str.length()-1; i >= 0; i-- ) {
            rev = rev + str.charAt(i);

        }

        System.out.println("The Reversed string is... "+rev);


        /*
         Inverting Using StringBuffer class...
        System.out.print("Reversing using StringBuffer class...");
        StringBuffer a = new StringBuffer(str);
        System.out.print(a.reverse());
        */


    }

}
