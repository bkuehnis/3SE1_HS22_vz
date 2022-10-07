package vzb.ch.zhaw.bauckluc.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Spiel {
	public static void main(String[] args) {
		Random rn = new Random();
		Scanner keyScan = new Scanner(System.in);
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int count = 0;
		int anzahlVersuche = 1;

		while (count<1) {
		int e = keyScan.nextInt();
		if (e<zahl) {
			System.out.println("zu klein");
		} else if (e>zahl){
			System.out.println("zu gross");
		} else {
			System.out.print("Richtig!");
			if (anzahlVersuche==1) {
			System.out.println("Du hast "+anzahlVersuche+" Versuch benötigt.");
		} else {
			System.out.println("Du hast "+anzahlVersuche+" Versuche benötigt.");
		}
		}
		anzahlVersuche++;
	}
		
	}
}
