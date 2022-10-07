package vza.ch.zhaw.baechni2.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);

		Random rn = new Random();
		int zahl = rn.nextInt(100);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int antwort = keyScan.nextInt();
		int counter = 1;
			while (zahl != antwort) {
				if (zahl < antwort){
					System.out.println("Zu Gross");
					counter ++;
					antwort = keyScan.nextInt();	
				} else {
					System.out.println("Zu klein");
					counter ++;
					antwort = keyScan.nextInt();
					}
				}
					System.out.println("Richtig!"+" Du hast " +counter+" Versuche gebraucht!");
					keyScan.close();
			} 
	}
// Da ich krank war und ich diese Arbeit nachgeholt habe,hat mir vereinzelt ein anderer Student bei der Aufgabe geholfen. Ich sehe damit fremde Quellen als gekennzeichnet :)