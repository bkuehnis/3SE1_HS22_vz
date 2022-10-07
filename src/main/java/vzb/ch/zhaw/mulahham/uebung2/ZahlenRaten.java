package vzb.ch.zhaw.mulahham.uebung2;

import java.util.Random;
import java.util.Scanner;
public class ZahlenRaten {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int gerateneZahl;
		int versuche = 1;

		boolean nichtErraten = true;
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		while(nichtErraten) {
			gerateneZahl = keyScan.nextInt();
				
			if (zahl == gerateneZahl) {
				System.out.println("Richtig. Du hast "+versuche+" Versuche benötigt.");
				nichtErraten = false;
			}
			else {
				versuche++;
				if (zahl > gerateneZahl) {
					System.out.println("Zu klein.");
				}
				else {
					System.out.println("Zu gross.");
				}
			}
		}		
	}
}
