package vza.ch.zhaw.kuralsar.uebung2;


//Uebung 2

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	
	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		int tryCount = 0;
		while (true) {
		int antwort = keyScan.nextInt();
		tryCount++;
		
		if (antwort == zahl){
		System.out.println("Richtig." + " Du hast " + tryCount + " Versuche benötigt.");
		break;	
		}
		
		else if (antwort > zahl) {
		System.out.println("Zu gross");
		}
		
		if (antwort < zahl) {
		System.out.println("Zu klein");
		}
	
		
			}
		
		
		
	}
}
