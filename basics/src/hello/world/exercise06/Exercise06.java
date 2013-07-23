package hello.world.exercise06;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 14.05.13
 * Time: 15:33
 * To change this template use File | Settings | File Templates.
 */
public class Exercise06 {

    public static void main(String... args) {
        HelloJavaWorld hjw = new HelloJavaWorld("this is some example text");

        System.out.println(hjw);
        // same same
        System.out.println(hjw.toString());

        // output text 'hello java world'

        HelloJavaWorld hjw2 = null; /* remove null and write your own stuff */

        System.out.println(hjw2);

    }

}
