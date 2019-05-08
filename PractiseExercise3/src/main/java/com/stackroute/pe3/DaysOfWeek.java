/* Program to calculate the first and last days of the week */

package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;

public class DaysOfWeek {
    public static void main(String[] args) {

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy ");
//
//        Date todayDate = new Date();
//        System.out.println("Today's date : " +df.format(todayDate));

        Calendar calendar = Calendar.getInstance();

        System.out.println("Today's date : " +df.format(calendar.getTime()));


        calendar.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        System.out.println("First day of the week : "+df.format(calendar.getTime()));

        calendar.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
        System.out.println("Last day of the week : "+df.format(calendar.getTime()));


    }



}
