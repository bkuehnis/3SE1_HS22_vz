package vza.ch.zhaw.reichraf.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {



	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int AnzahlVersuche = 1;
		int antwort =keyScan.nextInt();
		
		while (antwort!=zahl) {
		if (antwort<zahl) {
			System.out.println("Zu klein");			
		} else {
			System.out.println("Zu gross");
		}
		antwort= keyScan.nextInt();
		AnzahlVersuche++;
		}
			
			
			System.out.println("Richtig. Du hast " + AnzahlVersuche + " Versuche ben—tigt.");
		
	}
}
