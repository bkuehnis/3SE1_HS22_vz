package vzb.ch.zhaw.rechsfil.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();

		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		int zahlbenutzer= 0;
		int counter= 0;
		
		
		while(zahlbenutzer != zahl ) {
			counter++;
			zahlbenutzer = keyScan.nextInt();
			if (zahlbenutzer < zahl) {
				System.out.println("Zu klein");
			}
			else if(zahl == zahlbenutzer) {
				System.out.println("richtig. Du hast " +counter+ " Versuche benötigt.");
			}
			else {
				System.out.println("Zu gross");
			}
		}
		keyScan.close();
	}
}