package vzb.ch.zhaw.rinitsar.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101); // Erstellt eine Zufallszahl zwischen 1-100
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		int z1 = keyScan.nextInt(); // 1. Mal Zahl erraten
		int versuche = 1; // Variable definiert, um Versuche zu zählen
		
		while (z1 != zahl) {
			if (z1 > zahl) {
				System.out.println("Zu gross");}
				if (z1 < zahl) {
					System.out.println("Zu klein");}
				
				versuche++; // Versuche zählen
				
				z1 = keyScan.nextInt();	// Eingabe neue Zahl
		}
		
		if (z1 == zahl) {
			System.out.println("Richtig. Du hast " + versuche + " Versuche benoetigt.");
		}
		keyScan.close();
	}
		
	}
