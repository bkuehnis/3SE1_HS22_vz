package vza.ch.zhaw.murbalio.uebung2;

import java.util.Random;
import java.util.Scanner;


public class Zufallszahl {
	 public static void main(String[] args) {
		 Random rn = new Random();
		 Scanner keyScan = new Scanner(System.in);
	 
		 int zahl = rn.nextInt(101);
		 int a = 1;
		 
		 System.out.println("Rate eine Zahl zwischen 0 und 100");
		 
		 int antwort = keyScan.nextInt();
		 
		 while(antwort != zahl){
			 a++;
			 
			 if(antwort<zahl) {
				 System.out.println("zu klein");
			 }
			 if(antwort>zahl) {
				 System.out.println("zu gross");
			 }
			 antwort=keyScan.nextInt();
		}
	
System.out.println("Richtig. Du hast " +a+ " Versuche benötigt.");


keyScan.close();	
	 }
}