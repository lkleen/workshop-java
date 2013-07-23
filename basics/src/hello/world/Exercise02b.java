package hello.world;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: tjancusova
 * Date: 26.04.13
 * Time: 14:25
 * To change this template use File | Settings | File Templates.
 */
public class Exercise02b {

    public static void main(String[] args) throws Exception {

        InputStream in = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        System.out.print("type a number: ");


        String input = br.readLine();

        System.out.println("input was: " + input);

        int number = Integer.parseInt(input);

        System.out.println("input converted to number is: " + number);

        int x = number;
        if (x < 10) {
            System.out.println("is <10");
        } else if (x == 10) {
            System.out.println("is 10");
        } else {
            System.out.println("is >10");
        }


        int test = 4;

        if (test < 4) {
            // do something
        } else if (test > 100) {
            // do this
        } else {
            // dao that
        }



    }

}
