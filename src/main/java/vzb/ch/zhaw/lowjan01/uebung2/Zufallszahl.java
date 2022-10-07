package vzb.ch.zhaw.lowjan01.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int count = 1;
		
		//System.out.println(zahl); // dient als Versuchmittel
		
		Scanner keyScan = new Scanner(System.in);
		System.out.println("Rate eine Zahl zwischen 0 und 100");

		while (true) {
			int wzahl = new java.util.Scanner(System.in).nextInt();
			if (zahl == wzahl) {
				System.out.println("Richtig. Du hast " + count + " Versuche benötigt.");
				break; // Ende der Schleife
			} else if (zahl > wzahl)
				System.out.println("Zu klein");
			else if (zahl < wzahl)
				System.out.println("zu gross");
			count++;
		}
	}

}