package vza.ch.zhaw.gavindom.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl{
	public static void main(String[] args) {

		Random rn = new Random();
		Scanner keyScan = new Scanner(System.in);

		int zahl = rn.nextInt(101);

		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int antwort = keyScan.nextInt();
		int x = 0;

		while (antwort != zahl) {

			if (antwort < zahl) {
				System.out.println("zu klein");
				antwort = keyScan.nextInt();
			}

			if (antwort > zahl) {
				System.out.println("zu gross");
				antwort = keyScan.nextInt();
			}
			x ++;
			if (antwort == zahl) {	
			System.out.println("richtig. Du hast " + x + " Versuche benoetigt. ");
			
			
			}
			}
			 keyScan.close();
}
}
