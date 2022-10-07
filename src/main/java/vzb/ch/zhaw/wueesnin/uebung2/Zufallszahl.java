package vzb.ch.zhaw.wueesnin.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int versuche = 1;

		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int gerateneZahl = keyScan.nextInt();

		while (gerateneZahl != zahl) {
			if (gerateneZahl > zahl) {
				System.out.println("Zu gross");
			} else if (gerateneZahl < zahl) {
				System.out.println("Zu klein");
			}
			versuche++;
			gerateneZahl = keyScan.nextInt();
		}
		System.out.println("Richtig. Du hast " + versuche + " Versuche benötigt.");
		keyScan.close();
	}

}
