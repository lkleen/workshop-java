package hello.world.exercise10;

/**
 * a make the car driving exercise to show the basic principle of
 * object oriented programming
 */
public class Exercise10 {

    public static void main(String... args) {

        // initialize a new car object
        Car renaultTwingo = new Car(3);

        // initialize a new wheel object
        Wheel wheel01 = new Wheel();

        // add the wheel to the car
        renaultTwingo.addWheel(wheel01);

        // surprisingly something is missing to make the car driving.
        // your exercise is to add the missing parts ;)
        // good luck !

        renaultTwingo.drive();

    }

}
