package hello.world.exercise08;

import hello.world.Aloha;
import hello.world.exceptions.ExerciseNotSolvedException;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 17.05.13
 * Time: 14:17
 * To change this template use File | Settings | File Templates.
 */
public class Exercise08 {

    public static void main(String... args) {

        CounterInterface counter = new CounterClass();

        counter.setValue(0);

        out(counter.getValue()); // 0
        checkValue(counter, 0);

        out("step 1/5 SOLVED");

        counter.up();
        out(counter.getValue()); // 1
        checkValue(counter, 1);

        out("step 2/5 SOLVED");

        counter.up();
        counter.up();
        counter.up();
        out(counter.getValue()); // 4
        checkValue(counter, 4);

        out("step 3/5 SOLVED");

        counter.down();
        counter.down();
        checkValue(counter, 2); // 2

        out("step 4/5 SOLVED");

        counter.reset();
        checkValue(counter, 0); // 0

        out("step 5/5 SOLVED");



        // BONUS EXERCISE
        // fix this

        counter.reset();
        counter.down();
        counter.down();
        counter.down();
        counter.down();

        out("step 6/5 SOLVED");
        out("CONGRATULATIONS!");
    }

    private static void checkValue(CounterInterface counter,  int expected) {
        if(counter.getValue() != expected) {
            throw new ExerciseNotSolvedException("actual value is " + counter.getValue() + " but should be " + expected);
        }
    }


    private static void out(Object obj) {
        System.out.println(obj);
        if(obj.equals("CONGRATULATIONS!")) {
            new Aloha().run();
        }
    }

}
