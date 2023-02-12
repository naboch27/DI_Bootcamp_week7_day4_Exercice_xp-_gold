package exercice2;

import java.util.Random;

public class PickRandomFromNumber {
    public static int random(int a, int b) {
        //return new Random().nextInt(a, b + 1);
        return new Random().nextInt( b + 1);
    }
}
