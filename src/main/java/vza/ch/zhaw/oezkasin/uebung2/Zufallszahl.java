package vza.ch.zhaw.oezkasin.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		int zahl2 = keyScan.nextInt();
		
		while (zahl != zahl2) {
			if (zahl < zahl2) {
				System.out.println("zu gross");
				zahl2 = keyScan.nextInt();
			
			}  else if (zahl > zahl2) {
				System.out.println("zu klein");
				zahl2 = keyScan.nextInt();
			
			}
			
		}	//Ich habe leider nicht verstanden, wie ich die Anzahl der Eingaben zählen könnte.
			int versuche = 0;
			while (versuche < 0) {
			versuche++;
		}	System.out.println("Richtig. "+"Du hast "+ versuche +" Versuche benötigt");
				
				keyScan.close();
		}
			
	}
	







	


