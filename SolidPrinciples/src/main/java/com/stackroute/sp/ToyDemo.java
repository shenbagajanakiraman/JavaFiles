package com.stackroute.sp;

import java.util.Iterator;
import java.util.Scanner;

class Toy {
    private String name;
    private String colour;
    private float price;
    private String material;


    protected Toy(String name, String colour, float price, String material) {
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.material = material;
    }



    public void toyFunctionality() {
        System.out.println("I can't move or fly...");
    }


}

class ToyMovable extends Toy{
    private boolean batteryOperated;

    public ToyMovable(String name, String colour, float price, String material, boolean batteryOperated) {
        super(name, colour, price, material);
        this.batteryOperated = batteryOperated;
    }



    public void toyFunctionality() {
        System.out.println("I can move but can't fly...");
    }
}


class ToyFlyable extends ToyMovable {

    private boolean canFly;

    public ToyFlyable(String name, String colour, float price, String material, boolean batteryOperated, boolean canFly) {
        super(name, colour, price, material, batteryOperated);
        this.canFly = canFly;
    }

    public void toyFunctionality() {
        System.out.println("I can fly ;-) ");
    }
}





public class ToyDemo {
    public static void main(String[] args) {

        Toy doll = new Toy("Barbie","pink",100,"Plastic");
        ToyMovable robot = new ToyMovable("Robot","Grey",3000,"Steel",true);
        ToyFlyable helicopter = new ToyFlyable("MyCopter","white",5000,"Fiber",true,true);

        System.out.println("Base Class.....");
        doll.toyFunctionality();

        System.out.println("Derived class 1");
        robot.toyFunctionality();

        System.out.println("Derived class 2");
        helicopter.toyFunctionality();





    }

}

