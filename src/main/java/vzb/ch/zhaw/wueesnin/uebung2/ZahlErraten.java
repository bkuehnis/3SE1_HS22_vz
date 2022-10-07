package vzb.ch.zhaw.wueesnin.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZahlErraten {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int versuche = 1;

		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		System.out.println("Ok. Ich beginne jetzt zu raten. \n"
				+ "Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");

		int antwort = keyScan.nextInt();

		while (antwort != zahl) {
			if (antwort > zahl) {
				System.out.println("Ist es die " + zahl + "?");
			} else if (antwort < zahl) {
				System.out.println("Zu klein");
			}
			versuche++;
			antwort = keyScan.nextInt();
		}
		System.out.println("Richtig. Du hast " + versuche + " Versuche benötigt.");
		keyScan.close();

	}

}
