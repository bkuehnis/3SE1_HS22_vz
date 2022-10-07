package vzb.ch.zhaw.reiflja1.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int antwort = keyScan.nextInt();
		int anzVersuche = 1;
		while (antwort != zahl) {
			if (antwort > zahl) {
				System.out.println("Zu Gross");
			} else {
				System.out.println("Zu Klein");
			}
			antwort = keyScan.nextInt();
			anzVersuche++;
		}
		System.out.println("Richtig. Du hast " + anzVersuche + " Versuche benötigt.");
		keyScan.close();
	}
}