package it.unibo.design.robot.api;

/**
 * A robot that can grab objects
 *
 */
public interface RobotWithArms extends Robot{
    /**
     * Robot picks an object
     * 
     * @return true if robot picks the object, false if robot haven't free arms 
     */
    boolean pickUp();

    /**
     * Robot drops an object
     * 
     * @return true if robot drops the object, false if robot haven't objects
     */
    boolean dropDown();

    /**
     * Get the number of items carried
     * 
     * @return the number of items carried
     */
    int getItemsCarried();
}
