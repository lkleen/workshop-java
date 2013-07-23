package hello.world.exercise10;

import hello.world.exceptions.DriveException;
import hello.world.exceptions.FuelEmptyException;

import java.util.ArrayList;
import java.util.List;

/**
 * a car class
 */
public class Car {

    /**
     * the amount of doors this car should have
     */
    final int numDoors;

    /**
     * the driver of this car
     */
    Driver driver;

    /**
     * the engine of this car
     */
    Engine engine;

    /**
     * the cars fuel
     */
    final Fuel fuel = new Fuel(0);

    /**
     * the doors of this car
     */
    final List<Door> doors = new ArrayList<Door>();

    /**
     * the wheels of this car
     */
    final List<Wheel> wheels = new ArrayList<Wheel>();

    public Car(int numDoors) {
        if(numDoors <= 0) {
            throw new IllegalArgumentException("the amount of doors for you car cannot be <= 0");
        }
        this.numDoors = numDoors;
    }

    /**
     * drive this car. If something is missing a {@link DriveException} is thrown
     *
     * @throws DriveException
     */
    public void drive() throws DriveException {
        checkWheels();
        checkEngine();
        checkDriver();
        checkDoors();
        try {
            while(true) {
                fuel.consume();
                out("pöt");
                sleep(333);
            }
       } catch (FuelEmptyException e) {
            out("stopping. fuel is empty");
        }
    }

    private void out(String text) {
        System.out.println(text);
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkDoors() {
        if(doors.size() < numDoors) {
            throw new DriveException("I'm not that kind of car. you need to add at least " + numDoors + " to drive currently I have only " + doors.size() + " doors.");
        }
    }

    private void checkDriver() {
        if(driver == null) {
            throw new DriveException("I cannot driver without a driver");
        }
    }

    private void checkEngine() {
        if(engine == null) {
            throw new DriveException("I cannot drive without an engine");
        }
    }

    private void checkWheels() {
        if(wheels.size() < 4) {
            throw new DriveException("I am a car. Not a motorbike or anything else. I need 4 wheels to drive. Currently I have " + wheels.size() + " wheel(s)");
        }
    }

    public void addDoor(Door door) {
        if(doors.size() == numDoors) {
            throw new IllegalStateException("your car already has " + numDoors + " door(s)");
        }
    }

    public void addWheel(Wheel wheel) {
        if(wheels.size() == 4) {
            throw new IllegalStateException("your car already has four wheels");
        }
        wheels.add(wheel);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Fuel getFuel() {
        return fuel;
    }

}
