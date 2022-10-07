package vzb.ch.zhaw.jermaloi.uebung2;

import java.util.Random;
import java.util.Scanner;

public class UebungZwei {
    public static void main(String[] args) {

        Random rn = new Random();
        Scanner keyScan = new Scanner(System.in);

        int zahl = rn.nextInt(101);
        boolean antwortCorrect = false;
        int versuche = 0;

        System.out.println("Rate eine Zahl zwischen 0 und 100");

        do {
            int userInput = keyScan.nextInt();
            if (userInput == zahl) {
                antwortCorrect = true;
            } else if (userInput < zahl) {
                System.out.println("Zu klein");
            } else {
                System.out.println("Zu gross");
            }
            versuche++;
        } while (!antwortCorrect);
        System.out.println("Richtig! Du hast " + versuche + " Versuche benötigt.");
    }
}