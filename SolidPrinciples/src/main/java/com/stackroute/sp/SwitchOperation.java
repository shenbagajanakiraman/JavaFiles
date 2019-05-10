package com.stackroute.sp;

class Switch {
    private boolean switchValue;

    public Switch(boolean switchValue) {
        this.switchValue = switchValue;
    }

    public boolean getSwitchValue() {
        return switchValue;
    }

    public void flipSwitch() {

        if(switchValue) {
            System.out.println("Currently Switch is on... Turning it off");
            this.switchValue = false;

        }
        else {
            System.out.println("Currently Switch is off... Turning it on");
            this.switchValue = true;

        }



    }
}

public class SwitchOperation {

    public static void main(String[] args) {
        Switch mySwitch = new Switch(true);

        mySwitch.flipSwitch();
        mySwitch.flipSwitch();
        mySwitch.flipSwitch();

        mySwitch.flipSwitch();
        mySwitch.flipSwitch();
        mySwitch.flipSwitch();

        System.out.println("Final Switch Value.. "+mySwitch.getSwitchValue());

    }


}
