package hello.world.test;

import hello.world.exceptions.ExerciseNotSolvedException;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 27.05.13
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
public class Assert {

    public static void equals(Object actual, Object expected) {
        equals(actual, expected, actual + " does not equal " + expected);
    }

    public static void equals(Object actual, Object expected, String failMessage) {
        if(!actual.equals(expected)) {
            throw new ExerciseNotSolvedException(failMessage);
        }
    }

}
