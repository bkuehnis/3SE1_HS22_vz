package vzb.ch.zhaw.sprinala.uebung2;

import java.util.Random;
import java.util.Scanner;

public class SW02_Uebung_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        Random rn = new Random();

        int zahl = rn.nextInt(101);

        System.out.println("Rate eine Zahl zwischen 0 und 100 >");
        int guess = keyScan.nextInt();

        while (guess != zahl) {

            if (guess < zahl) {
                System.out.println("zu klein");
                guess = keyScan.nextInt();
            } else {
                System.out.println("zu gross");
                guess = keyScan.nextInt();
            }
        }
        System.out.println("Correct");
    }
}