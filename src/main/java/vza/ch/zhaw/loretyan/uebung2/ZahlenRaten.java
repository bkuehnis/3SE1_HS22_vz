package vza.ch.zhaw.loretyan.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();

		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int raten = keyScan.nextInt();
				
		int a = 1;

		while (raten != zahl) {
			if (raten < zahl) {
				System.out.println("Zu klein");
			}
			else {
				System.out.println("Zu gross");
			}
			a++;
			
			raten = keyScan.nextInt();
			
			
		} System.out.println("Richtig. Du hast "+a+ " Versuche gebraucht.");
	}
}
