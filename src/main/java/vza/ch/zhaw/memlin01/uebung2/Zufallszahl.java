package vza.ch.zhaw.memlin01.uebung2;


import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int count = 1;
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int eingabe = keyScan.nextInt();
				
		while(eingabe!=zahl) {
			if(eingabe > zahl) {
				System.out.println("zu gross");
			} else if(eingabe < zahl) {
				System.out.println("zu klein");
			} 
			
			eingabe = keyScan.nextInt();
			count++;
		}
		
			System.out.println("Richtig, du hast " + count + " Versuche benötigt!");
			
	}

}
