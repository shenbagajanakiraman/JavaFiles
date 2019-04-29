package com.stackroute.pe1;

import java.util.InputMismatchException;

public class Sample1 {

    private  boolean happy =false;
    private String str;

    public Sample1(String str) {
        this.str = str;
    }

    public boolean isHappy() {
        return happy;
    }

    public String getStr() {
        return str;
    }

    public void  isSheHappy() {

        happy = true;
    }

    public void printHappyMsg() {

        if (!happy) {
          throw new IllegalStateException();
        }

        System.out.println("I am Happy");
    }


    public String getHappyMsg() {
        System.out.println(happy+" Check check");
        if (!happy) {
           throw new IllegalStateException();
        }

        return ("I am Happy");
    }
}
