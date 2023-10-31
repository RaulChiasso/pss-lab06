package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.BasicArm;
import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{

    private static final double ARMS_FULL_CUNSUPTION = 0.3;

    private BasicArm armRight = new BasicArm();
    private BasicArm armLeft = new BasicArm();
    private int carriedItems;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.carriedItems=0;
    }

    public boolean pickUp() {
        if(super.isBatteryEnough(BasicArm.getConsumptionForPickUp()) && getCarriedItemsCount() < 2){
            if(!armRight.isGrabbing()){
                armRight.pickUp();
                this.carriedItems++;
                super.consumeBattery(BasicArm.getConsumptionForPickUp());
                return true;
            } else if(!armLeft.isGrabbing()){
                armLeft.pickUp();
                this.carriedItems++;
                super.consumeBattery(BasicArm.getConsumptionForPickUp());
                return true;
            }
        }
        return false;
    }

    public boolean dropDown() {
        if(super.isBatteryEnough(BasicArm.getConsumptionForDropDown()) && getCarriedItemsCount() > 0){
            if(armRight.isGrabbing()){
                armRight.dropDown();
                this.carriedItems--;
                super.consumeBattery(BasicArm.getConsumptionForDropDown());
                return true;
            } else if(armLeft.isGrabbing()){
                armLeft.dropDown();
                this.carriedItems--;
                super.consumeBattery(BasicArm.getConsumptionForDropDown());
                return true;
            }
        }
        return false;
    }

    public int getCarriedItemsCount() {
        return this.carriedItems;
    }

    @Override
    protected double getBatteryRequirementForMovement() {
        return RobotWithTwoArms.MOVEMENT_DELTA_CONSUMPTION + ARMS_FULL_CUNSUPTION * getCarriedItemsCount();
    }
}
