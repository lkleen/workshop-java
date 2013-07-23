package hello.world.exercise09;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 07.06.13
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */
public class Helper {

    /**
     * return index of smallest integer in the given list
     *
     * @param listtovalidate
     * @return index of minimum
     */
    public static int getIndexFromMinimum(List<Integer> listtovalidate) {
        int min = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for(int i = 0; i < listtovalidate.size(); i++) {
            int value = listtovalidate.get(i);
            if(value < min) {
                min = value;
                index = i;
            }
        }
        return index;
    }

}
