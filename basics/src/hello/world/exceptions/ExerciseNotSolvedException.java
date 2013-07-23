package hello.world.exceptions;

/**
 * exception which is thrown as long this exercise has not been completed
 */
public class ExerciseNotSolvedException extends RuntimeException {
    public ExerciseNotSolvedException(String message) {
        super(message);
    }
}
