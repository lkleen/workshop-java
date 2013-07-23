package hello.world.exercise07;

/**
 * slightly different from {@link hello.world.Exercise03b} but basically the same.
 */
public class Exercise07 {

    private static final ArrayMethods arrayMethods = new ArrayMethods();

    private static final int[] array = {8,3,4,9,45,-5,2,3,5,8,3,67,49,87,49,65,12,32,65,145,79,98,45};

    /**
     * do not change anything in this code!
     *
     * {@link ArrayMethods} has to be modified
     *
     * @param args
     */
    public static void main(String[] args) {

        // implement in class ArrayMethods
        int min = arrayMethods.minimumFrom(array);

        if(min != -5) {
            throw new IllegalArgumentException(min + " is not the minimum of the array");
        }

        // implement in class ArrayMethods
        int max = arrayMethods.maximumFrom(array);

        if(max != 145) {
            throw new IllegalArgumentException(max + " is not the maximum of the array");
        }

        // sometimes it fails, fix it
        for(int i = 0; i < 100; i++) {
            System.out.println(arrayMethods.randomValueFrom(array));
        }
    }



}
