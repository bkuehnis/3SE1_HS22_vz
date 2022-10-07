package vza.ch.zhaw.kernpas1.uebung2;

import java.util.Scanner;
import java.util.Random;

public class Zusatzaufgabe_C {

	public static void main(String[] args) {
	Scanner keyScan = new Scanner(System.in);
	Random rn = new Random();
	int zahl = rn.nextInt(100);
	
	System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
	String los = keyScan.nextLine();
	
	System.out.println("Ok. Ich beginne jetzt zu raten.\nAntworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");

	int newlow = 0;
    int newhigh = 100;
	int korrekt = 0;
	
	while (korrekt != 1) {
		System.out.println("\nIst es die "+zahl+"?");
		korrekt = keyScan.nextInt();
	    
		if (korrekt == 2) {
			newhigh = zahl-1;
			zahl = rn.nextInt(newhigh - (newlow-1))+newlow;
		} 
		if (korrekt == 3) {
			newlow = zahl+1;
			zahl = rn.nextInt(newhigh - zahl)+newlow;
		}
	} 
	System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
	keyScan.close();
  }
}
