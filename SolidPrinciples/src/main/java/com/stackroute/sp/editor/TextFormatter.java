package com.stackroute.sp.editor;



public class TextFormatter {

        String toUpperCase (Text myText){

            String str = myText.getText().toUpperCase();

            System.out.println(str);
            return str;
        }

    String findSubTextAndDelete( Text myText, String subString) {

        System.out.println("\nRemoving string '"+subString+"' from the given string");
        String updatedString = myText.getText().replace(subString,"");
        System.out.println(updatedString);
        return  updatedString;
    }
}


