package vza.ch.zhaw.streiluc.uebung2;

import java.util.Random;
import java.util.Scanner;
public class uebung {
	
public static void main(String[] args) {
	
	Scanner keyScan = new Scanner(System.in);
Random rn = new Random();

int zahl = rn.nextInt(101);
int zahl2 = 1;

System.out.println("Rate eine Zahl zwischen 0 und 100");
int antwort = keyScan.nextInt();

while (antwort != zahl) {
	if (antwort >= zahl) {
		System.out.println("zu gross");
		
		antwort  = keyScan.nextInt();
	} else {
		System.out.println("zu klein");
	
		antwort  = keyScan.nextInt();
		
	}
	zahl2++;
}

System.out.println("Richtig "+ "Du hast "+zahl2 + " Versuche gebraucht");
keyScan.close();
}
}