package vzb.ch.zhaw.osmanmin.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	
	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100 " +zahl);
		int antwort = keyScan.nextInt();
		
		while (antwort > zahl) {
			System.out.println("Zu Gross");
			antwort = keyScan.nextInt();
		while (antwort < zahl) {
			System.out.println("Zu Klein");
			antwort = keyScan.nextInt();
		}
		}
		
		if (antwort == zahl) {
			System.out.println ("Richtig. Du hast Versuche benötigt");
			keyScan.close();
		}
	}
}

//Die Anzahl der Antworten soll in der Zeile 25 ausgegeben werden.
//Jedoch kenne ich den Code nicht, wie viele Antworten / keyScan-Eingaben nötig waren.
// Auf den Folien von SW 02 ist es ebenfalls nicht ersichtlich