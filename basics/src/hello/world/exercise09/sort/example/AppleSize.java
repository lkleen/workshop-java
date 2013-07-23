package hello.world.exercise09.sort.example;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 07.06.13
 * Time: 16:10
 * To change this template use File | Settings | File Templates.
 */
public enum AppleSize {
    S("small"),
    M("medium sized"),
    L("large"),
    XL("extry large");

    final String text;

    private AppleSize(String text) {
        this.text = text;
    }
}
