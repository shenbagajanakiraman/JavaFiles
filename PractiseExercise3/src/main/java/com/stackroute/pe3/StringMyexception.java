package com.stackroute.pe3;

import java.io.FileNotFoundException;

public class StringMyexception extends Exception{
     StringMyexception(String msg) {

        String msg1 = "Defined Exception Constructor called......";
        System.out.println(msg);
        System.out.println(msg1);

    }

    public static void main(String[] args) throws StringMyexception {
        try {
            StringMyexception stringException = new StringMyexception("Hello There");
            StringMyexception stringException1 = new StringMyexception("Hiii There");

            throw new Exception("Just like that");
        }
//        catch (FileNotFoundException e) {
//            throw new Exception("File not found HAHAHA");
//        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            // This block will get get executed whether exception occures or
            // not.
            System.out.println("Exception Handling, Done right ;) ");
        }

    }
}