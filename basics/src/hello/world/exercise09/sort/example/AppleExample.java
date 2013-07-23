package hello.world.exercise09.sort.example;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 07.06.13
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
public class AppleExample {

    public static void main(String... args) {

        Apple apple01 = new Apple(AppleSize.L);
        Apple apple02 = new Apple(AppleSize.S);
        Apple apple03 = new Apple(AppleSize.XL);
        Apple apple04 = new Apple(AppleSize.M);

        Set<Apple> petersMessySetOfApples= new HashSet<Apple>();

        SortedSet<Apple> stevensProperSetOfApples= new TreeSet<Apple>();

        petersMessySetOfApples.add(apple01);
        petersMessySetOfApples.add(apple02);
        petersMessySetOfApples.add(apple03);
        petersMessySetOfApples.add(apple04);

        System.out.println("here we see peters messy set of apples");
        System.out.println(petersMessySetOfApples);

        stevensProperSetOfApples.add(apple01);
        stevensProperSetOfApples.add(apple02);
        stevensProperSetOfApples.add(apple03);
        stevensProperSetOfApples.add(apple04);

        System.out.println("\nhere we see stevens proper set of apples");
        System.out.println(stevensProperSetOfApples);
    }

}
