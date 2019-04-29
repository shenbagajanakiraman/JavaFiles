package com.stackroute.pe1;

public class SpecifyType {
      // Get input from User


    String str;


    protected String checkType(char ch) {
        if( (ch >= 97 ) && (ch <= 122)) {
            str ="Small letter"; // 97 - 122
        }

        else if ( (ch >= 65 ) && (ch <= 90)) {
            str ="Capital letter";
        }

        else if ( (ch <= 57 ) && (ch >= 48)) {
            str ="Number";
        }

        else { // Everything else is special Character

            str ="Special Character";
        }

        return str;

    }
}
