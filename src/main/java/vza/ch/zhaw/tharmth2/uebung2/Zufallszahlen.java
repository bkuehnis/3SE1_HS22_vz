package vza.ch.zhaw.tharmth2.uebung2;

import java.util.Random;
import java.util.Scanner;
public class Zufallszahlen {
	
 public static void main(String[] args) {
 Random rn = new Random();
 int zahl = rn.nextInt(101);
 System.out.println(zahl); 
 Scanner keyScan = new Scanner(System.in);
 System.out.println("Rate eine Zahl zwischen 0 und 100");
 System.out.println("Zufallszahlen: ");
 int Antwort = keyScan.nextInt();
 int counter = 0;
		 		 		 
while (zahl != Antwort) {
if (zahl > Antwort) {
	System.out.println("Zu klein");
	Antwort = keyScan.nextInt();
	counter += 1;
} else {
	
		System.out.println("Zu gross");
		  Antwort = keyScan.nextInt();
		  counter += 1;
	} 
		
}System.out.println("Richtig");
System.out.println("Du hast " + counter + " Versuche gehabt.");

} 
 }




