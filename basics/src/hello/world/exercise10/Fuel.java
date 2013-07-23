package hello.world.exercise10;

import hello.world.exceptions.FuelEmptyException;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 11.06.13
 * Time: 13:30
 * To change this template use File | Settings | File Templates.
 */
public class Fuel {

    int liters;

    /**
     * creates new fuel with the given amount of fuel in liters
     *
     * @param liters
     */
    public Fuel(int liters) {
        if(liters < 0) {
            throw new IllegalArgumentException("cannot initialize fuel with a value < 0. what is less than empty?");
        }
        this.liters = liters;
    }

    /**
     * consumes one liter of fuel. If the fuels is empty a {@link FuelEmptyException} is thrown

     * @throws FuelEmptyException if th efuel is empty
     */
    public void consume() throws FuelEmptyException {
        if(liters == 0) {
            throw new FuelEmptyException("fuels is empty. you cannot consume more fuel");
        }
        liters--;
    }

    /**
     * add the given amount of liters to this fuel
     *
     * @param liters liters to add
     */
    public void addFuel(int liters) {
        this.liters += liters;
    }

    /**
     * returns the amount of liters left
     *
     * @return
     */
    public int getLiters() {
        return liters;
    }

}
