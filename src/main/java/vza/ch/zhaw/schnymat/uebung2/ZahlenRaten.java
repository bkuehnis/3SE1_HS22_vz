package vza.ch.zhaw.schnymat.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		boolean istKorrekt = false;
		int versuche = 0;
		
		// Wird durchlaufen solange istKorrekt false ist.
		while(!istKorrekt) {
			System.out.println("Rate eine Zahl zwischen 0 und 100");
			int userInt = keyScan.nextInt();
			versuche += 1;
			// Checkt ob die Zahl passt, zu klein oder zu gross ist und gibt dies aus
			if (userInt == zahl) {
				System.out.println("Richtig! Du hast " + versuche + " Versuche benötigt.");
				istKorrekt = true;
			} else if (userInt > zahl) {
				System.out.println("Zu gross");

			} else {
				System.out.println("Zu klein");	
			}
		}
		keyScan.close();
	}
}