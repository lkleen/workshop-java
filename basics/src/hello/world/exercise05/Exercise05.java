package hello.world.exercise05;

/**
 * this exercise should show how to call methods of a class instance.
 */
public class Exercise05 {

    public static void main(String[] args) {

        ClassWithMethods myMethods = new ClassWithMethods();
        myMethods.sayExample();
        myMethods.sayText("text");
        myMethods.sayTextWithNumber("rot",3);
        myMethods.setValue(3);
        myMethods.sayValue();


        // 1. call sayText
        // 2. call sayTextWithNumber
        // 3. call sayValue
        // 4. if something fails, fix it

    }

}
