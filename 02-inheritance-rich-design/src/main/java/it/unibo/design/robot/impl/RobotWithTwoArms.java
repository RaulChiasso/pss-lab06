package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.BasicArm;
import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private static final double ARMS_FULL_CUNSUPTION = 0.3;
    private static final double NUMBER_OF_ARMS = 2;

    private BasicArm armRight;
    private BasicArm armLeft;
    private int carriedItems;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        armRight = new BasicArm();
        armLeft = new BasicArm();
        this.carriedItems=0;
    }

    private BasicArm firstFreeArm(){
        if(!armRight.isGrabbing()){
            return armRight;
        } else if(!armLeft.isGrabbing()){
            return armLeft;
        }
        return null;
    }

    private BasicArm firstOccupedArm() {
        if(armRight.isGrabbing()){
            return armRight;
        } else if(armLeft.isGrabbing()){
            return armLeft;
        }
        return null;
    }

    private void pick(BasicArm arm) {
        arm.pickUp();
        this.carriedItems++;
        super.consumeBattery(BasicArm.getConsumptionForPickUp());
    }

    private void drop(BasicArm arm) {
        arm.dropDown();
        this.carriedItems--;
        super.consumeBattery(BasicArm.getConsumptionForDropDown());
    }

    public boolean pickUp() {
        if(super.isBatteryEnough(BasicArm.getConsumptionForPickUp()) && getCarriedItemsCount() < NUMBER_OF_ARMS){
            pick(firstFreeArm());
            return true;
        }
        return false;
    }

    public boolean dropDown() {
        if(super.isBatteryEnough(BasicArm.getConsumptionForDropDown()) && getCarriedItemsCount() > 0) {
            drop(firstOccupedArm());
            return true;
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
