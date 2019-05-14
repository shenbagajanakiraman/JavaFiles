package com.stackroute.sp.editor;


public class Main {

    public static void main(String[] args) {

        Text myText = new Text("Even through the cracks, the light enters...","XYZ",1);
        TextFormatter textFormatter = new TextFormatter();
        textFormatter.toUpperCase(myText);
        textFormatter.findSubTextAndDelete(myText,"the");

        Printer printer = new Printer();
        printer.printValues(myText);

    }
}