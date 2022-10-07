package vzb.ch.zhaw.giagilea.uebung2;

import java.util.Scanner;

public class ZusatzAufgabe {

	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		boolean erraten = false;
		
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		String start = keyScan.nextLine();
		
		if (start.equals("")) {
			System.out.println("Ok. Ich beginne jetzt zu raten.");
			System.out.println("Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");
		}
		
		int zahl = 50;
		int hoechstMoeglichkeit = 100;
		int tiefstMoeglichkeit = 0;
		System.out.println(zahl);
		
		while (erraten == false) {
			int pruefung = keyScan.nextInt();
				
			if (pruefung == 2) {
				hoechstMoeglichkeit = zahl;
				zahl = (hoechstMoeglichkeit+tiefstMoeglichkeit)/2;

				System.out.println(zahl);
			}else if (pruefung == 3) {
				tiefstMoeglichkeit = zahl;
				zahl = (zahl+hoechstMoeglichkeit)/2;
					
				System.out.println(zahl);
			}else if (pruefung == 1) {
				System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
				erraten = true;
			}
			
		}
		

	}

}
