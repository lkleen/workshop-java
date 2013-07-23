package hello.world.exercise07;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 17.05.13
 * Time: 12:26
 * To change this template use File | Settings | File Templates.
 */
public class ArrayMethods {

    private final Random random = new Random();

    /**
     * just a useless example
     *
     * @param array
     * @return
     */
    public int randomValueFrom(int[] array) {
        int randomValue = random.nextInt(array.length);
        System.out.println("randomValue: " + randomValue);
        return array[randomValue];
    }

    /**
     * should return the minimum value
     *
     * @param array
     * @return
     */
    public int minimumFrom(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
    }
    System.out.println("and the min value is:" + min);
    return min; // return the minimum value from the array
    }

    /**
     * should return the maximum value
     *
     * @param array
     * @return
     */
    public int maximumFrom(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("and the max value is:" + max);
        return max; // return the maximum value from the array
    }
}