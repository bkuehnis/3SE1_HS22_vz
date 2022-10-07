package vza.ch.zhaw.vuchl001.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int eingabe = keyScan.nextInt();
		int versuche = 1;
		while (eingabe != zahl) {
			versuche ++;
			if (eingabe > zahl) {
				System.out.println("Zu gross");
				eingabe = keyScan.nextInt();
			} else {
				System.out.println("Zu klein");
				eingabe = keyScan.nextInt();
			}
		}
		if (eingabe == zahl) {
			System.out.println("Richtig. Du hast " + versuche + " Versuche ben—tigt.");
		}
	}
}