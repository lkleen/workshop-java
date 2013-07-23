package hello.world.exercise08;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 17.05.13
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public interface CounterInterface {

    void up();

    void down();

    void reset();

    int getValue();

    void setValue(int valueToSet);

}
