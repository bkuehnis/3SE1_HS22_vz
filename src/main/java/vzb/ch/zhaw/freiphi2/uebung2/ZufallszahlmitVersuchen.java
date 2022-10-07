package vzb.ch.zhaw.freiphi2.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZufallszahlmitVersuchen {
	public static void main(String[] args) {
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		Scanner keyScan = new Scanner(System.in);
		int a = 0;
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int antwort = keyScan.nextInt();

		while (antwort != zahl) {
			if (antwort > zahl) {
				System.out.println("Zu klein");
				a++;
				antwort = keyScan.nextInt();
			}
			if (antwort < zahl) {
				System.out.println("Zu gross");
				a++;
				antwort = keyScan.nextInt();
			} else {
				System.out.println("Richtig");
				a++;
				System.out.println("Sie haben " +a+ " Versuche gebraucht");

			}

		}
		keyScan.close();
	}

}