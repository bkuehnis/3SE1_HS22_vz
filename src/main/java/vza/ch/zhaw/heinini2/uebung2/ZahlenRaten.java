package vza.ch.zhaw.heinini2.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int eingabe=101;
		int versuche = 0;
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		while (zahl!=eingabe) {
			eingabe = keyScan.nextInt();
			if (eingabe<zahl) {
				System.out.println("Zu klein");
			} else if (eingabe>zahl) {
				System.out.println("Zu gross");
			}
			versuche++;
		}
		System.out.println("Richtig. Du hast "+versuche+" Versuche benötigt.");
		
		
		
	}

}
