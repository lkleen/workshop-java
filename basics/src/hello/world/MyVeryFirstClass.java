package hello.world;

import javax.sound.midi.SysexMessage;

public class MyVeryFirstClass {

    /**
     * returns the given string
     *
     * @param aString
     * @return
     */
    static String bla(String aString) {
        return aString;
    }

    /**
     * appens strag b to string a
     *
     * @param a
     * @param b
     * @return
     */
    static String test1(String a, String b) {
        return a + b;
    }

    /**
     * returns the given integer value
     *
     * @param aValue
     * @return
     */
    static int val(int aValue) {
        return aValue;
    }

    /**
     * adds x and y and returns the result
     *
     * @param x
     * @param y
     * @return
     */
    static int sum(int x, int y) {
        return x + y;
    }

    static void out(Object obj)   {
        System.out.println(obj);
    }
    /**
     * main method.
     *
     * write code to execute here
     *
     * @param args - arguments to main method
     */
    public static void main(String[] args) {
      out("ok");
    }

}
