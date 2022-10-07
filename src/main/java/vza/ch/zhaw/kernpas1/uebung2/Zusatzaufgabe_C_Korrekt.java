package vza.ch.zhaw.kernpas1.uebung2;

import java.util.Scanner;

public class Zusatzaufgabe_C_Korrekt {

	public static void main(String[] args) {
	Scanner keyScan = new Scanner(System.in);
		
	System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
	String los = keyScan.nextLine();
	
	System.out.println("Ok. Ich beginne jetzt zu raten.\nAntworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");
	
	int Zahl = 50;
	double änderung = 50;
	int antwort = 0;
	
	while (antwort != 1) {
		System.out.println("\nIst es die "+Zahl+"?");
		antwort = keyScan.nextInt();
		änderung /= 2;
	
		if (antwort == 2) {
		Zahl -= änderung;
		}
		
		else {
			Zahl += änderung;
		}
	}
	System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
	keyScan.close();
	}
}
