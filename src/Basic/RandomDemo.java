package Basic;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int radnum = r.nextInt(7);
            System.out.println(radnum);
        }
    }
}
