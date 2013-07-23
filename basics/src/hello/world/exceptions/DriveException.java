package hello.world.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 11.06.13
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class DriveException extends ExerciseNotSolvedException {
    public DriveException(String message) {
        super(message);
    }
}
