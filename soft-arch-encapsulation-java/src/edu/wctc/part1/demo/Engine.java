package edu.wctc.part1.demo;

public class Engine {

    private int cylinderCount;
    private boolean running;
    private final static int MAX_CYLINDERS = 12;

    public Engine(int cylinders) {
        setCylinderCount(cylinders);
    }

    // We are providing read-only access to this property (no setter).
    // This is a requirements issue.
    public int getCylinderCount() {
        return cylinderCount;
    }

    // By making this private you cannot change the cylinder count once
    // the engine is created. This is a requirements issue.
    private void setCylinderCount(int value) {
        if (value < 1 || value > MAX_CYLINDERS) { // magic numbers!
           throw new IllegalArgumentException("Invalid cylinder count");
        }
        cylinderCount = value;
    }

    public void start() {
        if (!running) {
            running = true;
        }
    }

    public void stop() {
        if (running) {
            running = false;
        }
    }

    // This is a getter method for the running property. By convention
    // boolean properties have getter methods that start with "is".
    // Notice there is no setter method - why? Because we want to control
    // how the property is mutated by only using the start() method.
    public boolean isRunning() {
        return running;
    }

}
