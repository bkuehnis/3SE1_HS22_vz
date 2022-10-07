package vza.ch.zhaw.kitantif.uebung2;

import java.util.Random;
import java.util.Scanner;

public class ZufallsZahlen {
 public static void main(String[] args) {

 Scanner keyScan = new Scanner(System.in);
 Random rn = new Random();
 int zahl = rn.nextInt(101);
 System.out.println("Rate eine Zahl zwischen 0 und 100");
 
 int tryCount = 0;
 int antwort = keyScan.nextInt();
 tryCount++;
 	
 	while (true) {
	
	 
	 if (antwort == zahl) 
		 System.out.println("Richtig" + "Du hast" + tryCount + "Versuche benötigt.");
		 break;
	 } 
 	 if (antwort > zahl) {
		 System.out.println("Zu klein");
		 
	 } else {
		 System.out.println("Zu gross"); 
		
		 
	 }
 }
 
 
 }








