package vzb.ch.zhaw.freiphi2.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int antwort = keyScan.nextInt();

		while (antwort != zahl) {
			if (antwort > zahl) {
				System.out.println("Zu klein");
				antwort = keyScan.nextInt();
			}
			if (antwort < zahl) {
				System.out.println("Zu gross");
				antwort = keyScan.nextInt();
			} else {
				System.out.println("Richtig");

			}

		}
		keyScan.close();
	}

}