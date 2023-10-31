package it.unibo.design.robot.api;

public class BasicArm {

    private static final double ENERGY_TO_PICK_UP=1.2;
    private static final double ENERGY_TO_DROP_DOWN=0.5;

    private boolean isGrabbing;

    
    BasicArm(String placeholder){

    }

    protected boolean isGrabbing(){
        return isGrabbing;
    }

    protected void pickUp(){
        if(!isGrabbing()){
            isGrabbing=true;
        }
    }

    protected void dropDown(){
        if(isGrabbing()){
            isGrabbing=false;
        }
    }

    protected double getConsumptionForPickUp(){
        return ENERGY_TO_PICK_UP;
    }

    protected double getConsumptionForDropDown(){
        return ENERGY_TO_DROP_DOWN;
    }
}
