package vzb.ch.zhaw.drarre01.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int zahl2 = keyScan.nextInt();
		int versuche = 1;
		while(zahl!= zahl2); {
			if(zahl>zahl2){
				System.out.println("Zu klein");
			}else{
				if(zahl<zahl2) {
					System.out.println("Zu gross");
				} else {
					System.out.println("Richtig du hast " +versuche+" Versuche benötigt");
				}
			
			}
		zahl2 = keyScan.nextInt();
		versuche++;	
		}
		keyScan.close();
	}
}
