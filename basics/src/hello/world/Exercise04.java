package hello.world;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 30.04.13
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
public class Exercise04 {

    public static void main(String[] args) {
      sayHello();
      sayBoo();
      sayNumber(3);
      sayString("bla");
      saySum(3,4);
      sayTextWithNumber("bla",3);
      out("string");

    }

    static void sayHello() {
        System.out.println("cheers");
    }

    static void sayBoo() {
        out("boo");
    }

    static void sayNumber(int i){
        out("number is: " + i);
    }

    static void sayString(String bla) {
        out("bla is: " + bla);
    }

    static void saySum(int x, int y) {
        out("sum is: " + (x + y));
    }

    static void sayTextWithNumber(String text, int number) {
        out("saying text: " + text + " with number: " + number);
    }



    static void out(Object obj) {
        System.out.println(obj);
    }


}
