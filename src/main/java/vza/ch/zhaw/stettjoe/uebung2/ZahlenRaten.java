package vza.ch.zhaw.stettjoe.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		int zahl = rn.nextInt(101);
		System.out.println(zahl);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int input = keyScan.nextInt();
		int counter = 1;
		
		while (input != zahl) {
			if (zahl < input) {
				System.out.println("Zu gross");
				input = keyScan.nextInt();
				counter ++;
			} else {
				System.out.println("Zu klein");
				input = keyScan.nextInt();
				counter ++;
			}
		}
		System.out.println("Richtig! Du hast "+counter+" Versuche benoetigt");
		keyScan.close();
	}
}
