package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms{

    public RobotWithTwoArms(String robotName) {
        super(robotName);
    }

    @Override
    public boolean pickUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pickUp'");
    }

    @Override
    public boolean dropDown() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dropDown'");
    }

    @Override
    public int getItemsCarried() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getItemsCarried'");
    }
     
}
