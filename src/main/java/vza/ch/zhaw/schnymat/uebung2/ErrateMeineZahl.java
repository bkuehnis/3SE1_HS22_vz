package vza.ch.zhaw.schnymat.uebung2;

import java.util.Scanner;

public class ErrateMeineZahl {
	
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		keyScan.nextLine();
		
		System.out.println("Ok. Ich beginne jetzt zu raten. \nAntworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.\n");
		
		int gerateneZahl = 50;
		int zaehler = 50;
		boolean istKorrekt = false;
		
		while(!istKorrekt) {
			zaehler /= 2;
			if (zaehler < 1) zaehler = 1;
			System.out.println("Ist es die " + gerateneZahl);
			int userInput = keyScan.nextInt();
			if (userInput == 1) {
				System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
				istKorrekt = true;
			} else if (userInput == 2) {
				gerateneZahl -= zaehler;
			} else if (userInput == 3) {
				gerateneZahl += zaehler;
			}
		}
		
		keyScan.close();
		
	}

}
