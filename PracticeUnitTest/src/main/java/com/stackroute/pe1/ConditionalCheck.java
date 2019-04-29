package com.stackroute.pe1;

import java.util.Scanner;

public class ConditionalCheck {

    private String str;


    public String checkFunction(int number) {

        if ((number >= 20) && (number <= 30)) {

            if (number % 2 == 1) {
                str = "Tom";
            } else
                str = "Jerry";
        } else {
            str = "Neither Tom nor Jerry";
        }
        return str;
    }

    public String Checkinput(String a) {
        if(false) {
            throw new IllegalArgumentException();
        }
        return "Exception thrown";
    }

}

