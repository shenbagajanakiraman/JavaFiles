package com.stackroute.sp.editor;


public class Printer {

    boolean printValues(Text myText) {
        System.out.println("Printing values......");

        System.out.println("Text : " +myText.getText());
        System.out.println("Author : " + myText.getAuthor());
        System.out.println("Length : " + myText.getLength());
        return  true;
    }
}
