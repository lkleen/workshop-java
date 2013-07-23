package hello.world.exercise09;

import hello.world.Aloha;
import hello.world.exceptions.ExerciseNotSolvedException;

import java.util.*;

/**
 * second part of {@link Exercise09a}
 *
 * in this exercise you don't have to implement the sort algorithm yourself
 */
public class Exercise09b {

    public static void main(String... args) {

        final int MAX_VALUE = 100;

        Random random = new Random();

        List<SortableElement> list = new ArrayList<SortableElement>();
        SortedSet<SortableElement> set = new TreeSet<SortableElement>();

        for(int i = 0; i < 100; i++) {
            SortableElement value = new SortableElement(random.nextInt(MAX_VALUE));
            list.add(value);
            set.add(value);
        }

        System.out.println("list elements");
        out(list);

        System.out.println("\nset elements");
        out(set);

        // fix the compare method in {@link SortableElement} to solve this check
        checkExerciseSolved(set);

        new Aloha().run(20);

        System.out.println("\nset elements");
        out(set);
    }

    private static void checkExerciseSolved(SortedSet<SortableElement> set) {
        Integer last = null;
        Integer current = null;

        for(SortableElement elem : set) {
            if(last == null) {
                last = elem.value;
            } else {
                current = elem.value;
                if(current < last) {
                    throw new ExerciseNotSolvedException(current + " < " + last);
                }
                last = current;
            }
        }
    }

    private static void out(Collection<SortableElement> collection) {
        for(SortableElement elem : collection) {
            System.out.print(elem + " ");
        }
    }

}
