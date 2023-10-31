package it.unibo.design.robot.api;

public class BasicArm {

    private static final double ENERGY_TO_PICK_UP=1.2;
    private static final double ENERGY_TO_DROP_DOWN=0.5;

    private boolean isGrabbing;

    
    public BasicArm(){
        this.isGrabbing=false;
    }

    public boolean isGrabbing(){
        return isGrabbing;
    }

    public void pickUp(){
        isGrabbing=true;
    }

    public void dropDown(){
        isGrabbing=false;
    }

    public static double getConsumptionForPickUp(){
        return ENERGY_TO_PICK_UP;
    }

    public static double getConsumptionForDropDown(){
        return ENERGY_TO_DROP_DOWN;
    }
}
