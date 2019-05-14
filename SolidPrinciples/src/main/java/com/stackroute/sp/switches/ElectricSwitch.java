package com.stackroute.sp.switches;


public class ElectricSwitch implements ElectricAppliance {
    private boolean state;
    private ElectricAppliance electricAppliance;

    public ElectricSwitch(ElectricAppliance electricAppliance) {
        this.electricAppliance = electricAppliance;
    }

    @Override
    public boolean switchFlip() {
        return false;
    }
}


