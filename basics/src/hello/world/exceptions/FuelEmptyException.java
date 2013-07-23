package hello.world.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 11.06.13
 * Time: 13:32
 * To change this template use File | Settings | File Templates.
 */
public class FuelEmptyException extends ExerciseNotSolvedException {
    public FuelEmptyException(String message) {
        super(message);
    }
}
