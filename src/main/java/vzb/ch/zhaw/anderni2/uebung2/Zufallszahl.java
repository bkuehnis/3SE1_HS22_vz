package vzb.ch.zhaw.anderni2.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        Random rn = new Random();
        int zahl = rn.nextInt(101);
        System.out.println(zahl);

        System.out.println("Rate eine Zahl zwischen 0 und 100");
        int antwort = keyScan.nextInt();
        int counter = 0;

        while (antwort != zahl) {

            if (antwort > zahl) {
                System.out.println("zu gross");
                counter++;
            } else if (antwort < zahl) {
                System.out.println("zu klein");
                counter++;
            }

            antwort = keyScan.nextInt();
        }
        System.out.println("Richtig, du hast " + counter + " Versuche benötigt!");
    }
}