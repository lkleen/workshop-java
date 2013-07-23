package hello.world.exercise05;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 30.04.13
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class ClassWithMethods {

    private Integer value = null;

    private static final String exampleText = "hello I am the example which shows how to call a method fram a class instance.";


    public void sayExample() {
        out(exampleText);
    }


    public void sayTextWithNumber(String text, int number) {
        out(text + " with " + number);
    }

    public void sayText(String text) {
        out(text);
    }

    public void sayValue() {
        if(value == null) {
            throw new IllegalStateException("value is null. please call method 'setValue' before calling this method.");
        }
        out("value is: " + value);
    }

    public void setValue(int value) {
        this.value = value;
    }

    private static void out(Object obj) {
        System.out.println(obj);
    }

}
