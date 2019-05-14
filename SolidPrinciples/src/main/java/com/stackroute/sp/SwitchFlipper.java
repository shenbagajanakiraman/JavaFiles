package com.stackroute.sp;

public class SwitchFlipper {


    boolean switchFlip(Switch mySwitch) {
        boolean flag;


        if (mySwitch.getSwitchValue()) {
            System.out.println("Currently Switch is on... Turning it OFF");
            flag = false;


        } else {
            System.out.println("Currently Switch is off... Turning it ON");
            flag = true;

        }

        return flag;
    }
}
