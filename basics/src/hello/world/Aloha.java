package hello.world;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: lkleen
 * Date: 17.05.13
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class Aloha {

    static char[] ALOHA = {'A','L','O','H','A','W','E','L','L','E'};

    static char[] spaces = {' ',' ',' ',' ',' '};

    public void run() {
        printAloha(4);
    }

    public void run(int frequency) {
        printAloha(frequency);
    }

    private void printAloha(int frequency) {
        boolean up = true;
        int upDown = 0;

        int ms = 1000 / frequency;

        for(int i = 0; i < 100; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(Arrays.copyOf(spaces, upDown));
            sb.append(ALOHA[i % ALOHA.length]);
            System.out.println(sb.toString());

            upDown += (up) ? 1 : -1;
            up = (upDown == 0) ? true : up;
            up = (upDown == ALOHA.length) ? false : up;
            sleep(ms);

        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
