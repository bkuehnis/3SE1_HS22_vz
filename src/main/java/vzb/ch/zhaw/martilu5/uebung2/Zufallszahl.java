package vzb.ch.zhaw.martilu5.uebung2;

import java.util.Scanner;
import java.util.Random;

public class Zufallszahl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int eingabe = 0;
		int versuche = 0;
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		
		
		while (eingabe != zahl) {
			eingabe = keyScan.nextInt();
			versuche++;
			if (eingabe < zahl) {
				System.out.println("zu klein");						
			} else if (eingabe > zahl) {
				System.out.println("zu gross");
			}
		}
		if (eingabe == zahl) {
			System.out.println("Richtig. Du hast "+versuche+" Versuche benötigt");
		}
		keyScan.close();
		 
	}

}
