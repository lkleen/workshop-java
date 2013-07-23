package hello.world.exercise08;

/**
 * exception which is thorwn when the counter has not been initialized
 */
public class CounterNotInitializedException extends RuntimeException {
    public CounterNotInitializedException(String message) {
        super(message);
    }
}
