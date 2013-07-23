package hello.world.exercise09;

import hello.world.test.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * this exercise should give you a short introduction to the collections framework
 *
 * see: http://docs.oracle.com/javase/tutorial/collections/
 */
public class Exercise09a {

    public static void main(String... args) {
        int actual;
        List<Integer> tatiana = new ArrayList<Integer>();

        tatiana.add(6);
        tatiana.add(12);
        tatiana.add(56);
        tatiana.add(8);

        // add some element to the list here

        actual = tatiana.get(0);
        Assert.equals(actual, 6);

        actual = tatiana.get(1);
        Assert.equals(actual, 12);

        actual = tatiana.get(2);
        Assert.equals(actual, 56);

        actual = tatiana.get(3);
        Assert.equals(actual, 8);

        List<Integer> sortedList = new ArrayList<Integer>();

        // now you should do something to sort the elements from list
        int minimumIndex=Helper.getIndexFromMinimum(tatiana);
        int minimumValue=tatiana.get(minimumIndex);
        System.out.println(minimumIndex);
        System.out.println(minimumValue);
        System.out.println(tatiana.get(minimumIndex));
        // in a new list (sortedList).

        sortedList.add(minimumValue);

        actual = sortedList.get(0);
        Assert.equals(actual, 6);

        actual = sortedList.get(1);
        Assert.equals(actual, 8);

        actual = sortedList.get(2);
        Assert.equals(actual, 12);

        actual = sortedList.get(3);
        Assert.equals(actual, 56);

    }

}
