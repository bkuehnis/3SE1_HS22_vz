package vza.ch.zhaw.weberth6.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Uebung2ZahlenRaten {
	
public static void main(String[] args) {
Scanner keyScan = new Scanner(System.in);
Random rn = new Random();
int zahl = rn.nextInt(101);
System.out.println("Rate eine Zahl zwischen 0 und 100");
int antwort = keyScan.nextInt();
int versuche = 1;

while (antwort != zahl ) { //true
	if (antwort > zahl) {
		System.out.println("zu gross");
		antwort = keyScan.nextInt();
		versuche++;
	}
	
	else {
		System.out.println("zu klein");
		antwort = keyScan.nextInt();
		versuche++;
	}

}
System.out.println("Richtig");
System.out.println("Du hast "+versuche+" Versuche gebraucht");
keyScan.close();
}
}

