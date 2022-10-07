package vza.ch.zhaw.drmicfil.uebung2;

import java.util.Random;
import java.util.Scanner;
public class Zufallsgenerator {

	public static void main(String[] args) {
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		Scanner keyScan = new Scanner(System.in);

		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int antwort = 101;
		int count = 1;
		
		

		while (antwort != zahl) {
			antwort = keyScan.nextInt();
			
			if (antwort<zahl) {
				System.out.println("zu klein");
				count++;
			} 
			
			if (antwort>zahl) {
				System.out.println("zu gross");
				count++;
				
			}
			

			
		}
		System.out.println("Richtig. Du hast " +count+ " Versuche benötigt.");
		
		keyScan.close();
	}

}


