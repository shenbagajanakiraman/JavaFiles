package com.stackroute.pe1;

public class ReverseString {



    String rev = "";

    protected String reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
}
