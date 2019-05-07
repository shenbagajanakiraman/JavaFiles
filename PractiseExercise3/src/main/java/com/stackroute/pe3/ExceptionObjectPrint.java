package com.stackroute.pe3;

public class ExceptionObjectPrint {
    public static void main(String[] args) {
        try {
            System.out.print("Negative Array index Exception : ");
            int[] arr = new int[-5];
        } catch (Exception e) {
            System.out.println(e);

        }

        try {
            System.out.print("Index Out of bound Exception : ");
            int[] arr = new int[1];
            arr[0] = 5;
            arr[1] = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.print("Null Pointer Exception :");
            int[] arr = null;
            if(arr[0] == 25){}
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
