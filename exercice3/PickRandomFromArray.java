package exercice3;

import java.util.ArrayList;
import java.util.Random;

public class PickRandomFromArray {
    public static String random(ArrayList<String> values) {
        // return a random string from the ones contained in values
        //int randomIndex = new Random().nextInt(0, values.size());
        int randomIndex = new Random().nextInt(values.size());
        return values.get(randomIndex);
    }
}
