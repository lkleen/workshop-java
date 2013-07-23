package hello.world.exercise08;

/**
 * class which implements {@link CounterInterface}
 */
public class CounterClass implements CounterInterface {

    private int value = 0;

    /**
     * count up
     */
    @Override
    public void up() {
        checkValue();
        // your code here
           value=value+1;
    }

    /**
     * count down
     */
    @Override
    public void down() {
        checkValue();
        // your code here
        value=value-1;
    }

    /**
     * sets counter value to zero
     */
    @Override
    public void reset() {
        // your code here
        value=0;
    }

    /**
     * return current counter value or -1 if the counter has not been initialized
     *
     * @return
     */
    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int valueToSet) {
        // your code here
        this.value=valueToSet;
        valueToSet=0;

    }

    private void checkValue() {
        if(value < 0) {
            throw new CounterNotInitializedException("value == " + value + " value has to be greater or equal to zero");
        }
    }

}
