package vzb.ch.zhaw.celikezg.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
			
			Random rn = new Random();
			
			int zahl = rn.nextInt(101);
			System.out.println("Rate eine Zahl zwischen 0 und 100");
			
			int eingabe;
			int zaehler = 0;
			
			do {
				eingabe = keyScan.nextInt();
				zaehler++;
				if (eingabe < zahl) {
					System.out.println("zu klein");
				} else if (eingabe > zahl) {
					System.out.println("zu gross");
				} else if (eingabe == zahl) {
					  System.out.println("Richtig. Du hast "+zaehler+" Versuche benötigt.");
				}
			} while (eingabe != zahl);
				
		keyScan.close();
				
   }
}
