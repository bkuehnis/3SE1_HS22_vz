package vza.ch.zhaw.zejnutri.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Spiel {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int versuche = 1;
		
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		int antwort = keyScan.nextInt();
		
	while (antwort != zahl) {
		
		if (antwort == zahl) {
	}	else {
			if (antwort > zahl) {
				System.out.println("Zu gross");
				antwort = keyScan.nextInt();
				versuche += 1;
	
	}	else {
		System.out.println("Zu klein");
		antwort = keyScan.nextInt();
		versuche += 1;
	}
	}
		
	}
		System.out.println("Richtig. Du hast "+versuche+" Versuche benötigt.");
	
	}
}
