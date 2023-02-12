import exercice2.PickRandomFromNumber;
import exercice3.PickRandomFromArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
        //GuessNumberGame.playTheGame();

        //Exercice 2
        System.out.println(PickRandomFromNumber.random(1, 6));

        //Exercice 3
        ArrayList<String> dataListe = new ArrayList<String>();
        dataListe.add("Banane");
        dataListe.add("Mangue");
        dataListe.add("Orange");
        dataListe.add("Anana");
        dataListe.add("Papaye");
        System.out.println(PickRandomFromArray.random(dataListe));
    }
}