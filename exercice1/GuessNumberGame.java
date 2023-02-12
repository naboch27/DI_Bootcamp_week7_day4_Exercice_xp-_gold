package exercice1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static Scanner scanner = new Scanner(System.in);
    private static int nbJeux = 1;
    private static int nbVictoire = 0;
    private static int nbDefaite = 0;

    public static void playTheGame() {
        // int generateNumber = new Random().nextInt(1, 1001);
        int generateNumber = new Random().nextInt(1001);
        int nbTentatives = 5;
        int inputUser = 0;
        System.out.println("generateNumber: " + generateNumber);

        System.out.println("Un nombre compris entre 1 et 1000 a été généré par l'ordinateur" +
                "\n Essayez de le deviner, vous avez 5 chances!");
        do {

            inputUser = scanner.nextInt();

            if (inputUser > generateNumber) {
                System.out.println("Votre nombre est plus grand que celui généré par l'ordinateur");
            } else if (inputUser < generateNumber) {
                System.out.println("Votre nombre est plus petit que celui généré par l'ordinateur");
            }
            nbTentatives--;
            if (nbTentatives != 0 && inputUser != generateNumber) {
                System.out.println("Il vous reste " + nbTentatives + " essai(s)");
            }

        } while (inputUser != generateNumber && nbTentatives != 0);

        if (inputUser == generateNumber) {
            System.out.println("Bravo, vous avez trouvé le resultat après " + (5 - nbTentatives) + " esssai(s)");
            nbVictoire++;
        } else {
            System.out.println("Désolé, vous avez perdu! Vous aurez plus de chances la prochaine fois.");
            nbDefaite++;
        }
        repeatTheGame();
    }

    private static void repeatTheGame() {
        System.out.println("Voulez-vous jouer à nouveau ?(Y/n)");
        String reponse = scanner.next();

        if (reponse.toLowerCase().trim().equalsIgnoreCase("yes")
                || reponse.toLowerCase().trim().equalsIgnoreCase("oui")
                || reponse.toLowerCase().trim().equalsIgnoreCase("y")) {
            nbJeux++;
            playTheGame();
        } else {
            System.out.println("Vous nous quittez déjà, j'espere que vous avez pris plaisir à jouer au jeu :)");
            System.out.println("Vous avez joué " + nbJeux + " fois");
            System.out.println("Vous avez gagné " + nbVictoire + " fois");
            System.out.println("Vous avez perdu " + nbDefaite + " fois");
        }
    }
}
