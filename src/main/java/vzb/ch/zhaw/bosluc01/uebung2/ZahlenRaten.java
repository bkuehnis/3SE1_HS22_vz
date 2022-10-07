package vzb.ch.zhaw.bosluc01.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int guess, tries = 1;
		while((guess = keyScan.nextInt()) != zahl) {
			if (guess < zahl)
				System.out.println("Zu klein");
			else
				System.out.println("Zu gross");
			tries++;
		}
		System.out.println("Richtig. Du hast " + tries + " Versuche benötigt.");
		keyScan.close();
	}
}