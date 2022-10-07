package vzb.ch.zhaw.rechsfil.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl2 {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		
		int zahlbenutzer = keyScan.nextInt();
		int zahl = rn.nextInt(100);
		int bewertung = 0;
		
		System.out.println("Ok. Ich beginne jetzt zu raten. \nAntworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser");
		
		while(zahlbenutzer != zahl ) {
			System.out.println("Ist es die " +zahl);
			bewertung= keyScan.nextInt();
			if (bewertung == 1) {
				System.out.println("Uff, das war schwierig. Spelen wir nochmal?");
			}
			else if(bewertung == 2) {
				zahl= rn.nextInt(zahl);
			}
			else {
				zahl=  rn.nextInt(100);
				// Wie definiere ich einen Zahlenbereich für Zufallszahlen?
			}
		}
		keyScan.close();
	}
}