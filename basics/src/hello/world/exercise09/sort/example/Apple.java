package hello.world.exercise09.sort.example;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 07.06.13
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public class Apple implements Comparable<Apple> {

    final AppleSize size;

    static int index = 0;

    final int id = index++;

    public Apple(AppleSize size) {
        this.size = size;
    }

    /**
     * returns a value < 0 if that apple is bigger than this apple
     * returns 0 if both apples has the same size
     * returns a value > 0 if that apple is bigger than this apple
     *
     * @param that
     * @return
     */
    @Override
    public int compareTo(Apple that) {
        return this.size.ordinal() - that.size.ordinal();
    }

    /**
     * just for returning a meaningful text like 'small apple'
     *
     * @return
     */
    @Override
    public String toString() {
        return size.text + " apple";
    }


    /**
     * ignore this stuff. it is not related to sorting
     *
     * @return
     */
    @Override
    public int hashCode() {
        return id;
    }
}
