package vza.ch.zhaw.mahamqab.uebung2;
import java.util.Random;
import java.util.Scanner;

public class gruppenarbeit {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);

		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println(zahl);
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
				}	System.out.println("Richtig");
					System.out.println("Benötigte Versuche: " +counter);
					keyScan.close();
			} 
	}