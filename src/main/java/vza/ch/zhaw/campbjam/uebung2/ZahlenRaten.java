package vza.ch.zhaw.campbjam.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
//		System.out.println(zahl);

		int eingabe = keyScan.nextInt();

		int counter = 1;

		while (eingabe != zahl) {
			while (eingabe > zahl) {
				System.out.println("Zu gross");
				eingabe = keyScan.nextInt();
				counter++;
			}
			while (eingabe < zahl) {
				System.out.println("Zu klein");
				eingabe = keyScan.nextInt();
				counter++;
			}
		}
		System.out.println("Richtig, du hast " + counter + " Versuche gebraucht.");
		keyScan.close();
	}
}