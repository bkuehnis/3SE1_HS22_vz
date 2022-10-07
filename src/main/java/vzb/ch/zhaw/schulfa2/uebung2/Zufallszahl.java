package vzb.ch.zhaw.schulfa2.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		Scanner keyScan = new Scanner(System.in);
		int guess = keyScan.nextInt();
		
		int counter = 1;
		
		while(zahl != guess) {
			
			if (guess > zahl) {
				System.out.println("Zu gross");
			} else if (guess < zahl) {
				System.out.println("Zu klein");
			}
			
			guess = keyScan.nextInt();
			counter++;
		}
		
		System.out.println("Richtig. Du hast " + counter +" Versuche benötigt");
		
	}
}