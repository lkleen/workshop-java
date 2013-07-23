package hello.world;

/**
 * Created with IntelliJ IDEA.
 * User: tjancusova
 * Date: 26.04.13
 * Time: 15:21
 * To change this template use File | Settings | File Templates.
 */
public class Exercise03b {
    public static void main(String args[]) {

        int values [] = {10, 12, 56, 7, 23, 98, 56, 4, 6, 6};

        int min = Integer.MAX_VALUE;
        System.out.println("min value is:" + min);

        for (int i = 0; i < values.length; i++) {
            System.out.println("i value is:" + values[i]);
            if(values[i] < min){
                min = values[i];
            }
            System.out.println("and the min value is:" + min);
        }
        System.out.println("the min value is:" + min);
    }
}
