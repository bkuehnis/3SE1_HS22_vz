package vza.ch.zhaw.friesti1.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		Random rn = new Random();
		int zahl = rn.nextInt(100);
		Scanner keyScan = new Scanner(System.in);
		int guess = keyScan.nextInt();
		int tries = 0;
		while (guess != zahl) {
			if (guess > zahl) {
				System.out.println("Zu gross");
			} else {
				System.out.println("Zu klein");
			}
			tries++;
			guess = keyScan.nextInt();
		}
		System.out.println("Richtig. Du hast " + tries + " Versuche benötigt!");
		keyScan.close();
	}
}