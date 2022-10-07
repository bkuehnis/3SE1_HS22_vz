package vza.ch.zhaw.kernpas1.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		
		Random rn = new Random();
		Scanner keyScan = new Scanner(System.in);
		
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int antwort = keyScan.nextInt();
		int zähler = 0;
		
		while (antwort != zahl) {
			if (antwort < zahl) {
				System.out.println("Zu klein");
			} else {
				System.out.println("zu Gross");
			}
			zähler++;
			antwort = keyScan.nextInt();
		} if (antwort == zahl) {
			System.out.println("Richtig. Du hast "+zähler+" Versuche benötigt.");
		}
		keyScan.close();
		
	}

}
