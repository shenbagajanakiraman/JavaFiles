package com.stackroute.pe1;

import java.util.Scanner;

public class AddingIntegers {

    int sum;
    boolean flag;

    protected int findSum(int[] arrayInt) {
        for( int i = 0; arrayInt[i] != 0;i++) {
            sum = sum + arrayInt[i];
        }

        return sum;

    }


    protected boolean findFloat(float[] arrayDouble) {
        for( int i = 0; arrayDouble[i] != 0;i++) {
            if ((int) arrayDouble[i] != arrayDouble[i]) {
                flag = false;
                break;

            }

            flag = true;

        }

        return flag;

    }

    public String Checkinput(String a) {
        if(false) {
            throw new IllegalArgumentException();
        }
        return "Exception thrown";
    }
}


