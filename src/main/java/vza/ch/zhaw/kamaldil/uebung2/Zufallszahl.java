package vza.ch.zhaw.kamaldil.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
 public static void main(String[] args) {
	 Random rn = new Random();
	 int zahl = rn.nextInt(100);
	 int loop = 1;
	 
	 
	 Scanner keyScan = new Scanner(System.in);	 
	 System.out.print("Rate eine Zahl zwischen 0 und 100\n");
	 int antwort = keyScan.nextInt();
	 
	 while (antwort != zahl) {
		 if (antwort > zahl) {
		 
		 	System.out.println("zu gross");
		 	antwort = keyScan.nextInt();
		 	loop += 1;
		 }
		 	else {
		 		System.out.println("zu klein");
		 		antwort = keyScan.nextInt();
		 		
		 		loop += 1;
		 	}
		 
	 }
	 System.out.println("Richtig. Du hast " + loop + " Versuche benötigt.");
 }
}
