package vza.ch.zhaw.bauerfel.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();

		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int antwort = 102;
		int anzahl = 0;
		while (antwort != zahl) {
			antwort = keyScan.nextInt();
			anzahl++;
			if (zahl < antwort) {
				System.out.println("Zu Gross");

			} else if (antwort < zahl) {
				System.out.println("Zu Klein");
			} else {

				System.out.println("Richtig. Du hast " + anzahl + " Versuche benötigt");

			}

		}
	}
}