package vzb.ch.zhaw.freiphi2.uebung2;

import java.util.Scanner;

public class KI_Aufgabe {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);

		int min = 0;
		int max = 100;
		int abfragewert = (min + max) / 2;
		System.out.println("Denk dir eine Zahl zwischen 0 und 99 aus und drücke dann Enter.");

		System.out.println("Ok, ich beginne jetzt zu raten");
		System.out.println("Antworte mir mit 1 für richtig, 2 für zu klein und 3 für zu gross");
		System.out.println("Ist es die " + abfragewert + " ?");
		int antwort = keyScan.nextInt();

		while (antwort != 1) {
			if (antwort == 3) {
				System.out.println("Zu gross");
				max = abfragewert;
				abfragewert = (min + max) / 2;
				System.out.println("Ist es die" + abfragewert + "?");
				antwort = keyScan.nextInt();

			}
			if (antwort == 2) {
				System.out.println("Zu klein");
				min = abfragewert;
				abfragewert = (min + max) / 2;
				System.out.println("Ist es die" + abfragewert + "?");
				antwort = keyScan.nextInt();

			}
		}
		if (antwort == 1) {
			System.out.println("Uff, das war schwierig...Spielen wir nochmals?");

		}
		keyScan.close();
	}

}