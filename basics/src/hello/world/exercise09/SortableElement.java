package hello.world.exercise09;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 27.05.13
 * Time: 10:22
 * To change this template use File | Settings | File Templates.
 */
public class SortableElement implements Comparable<SortableElement> {

    final int value;

    public SortableElement(int value) {
        this.value = value;
    }

    /**
     * this method should return a value < 0 if this.value < that.value
     * 0 if the values are equal
     * something > 0 if this.value > that.value
     * @param that
     * @return
     */
    @Override
    public int compareTo(SortableElement that) {
        return -1;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
