package com.stackroute.sp;

public class MainSwitch {

          public static void main(String[] args) {
            Switch mySwitch = new Switch(false);
            SwitchFlipper switchFlipper = new SwitchFlipper();


              System.out.println(switchFlipper.switchFlip(mySwitch));


        }


    }

