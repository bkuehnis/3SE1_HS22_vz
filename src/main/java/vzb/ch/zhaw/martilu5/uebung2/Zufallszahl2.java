package vzb.ch.zhaw.martilu5.uebung2;

import java.util.Scanner;
import java.util.Random;

public class Zufallszahl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		int eingabe = 0;
		
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		System.out.println(" ");
		System.out.println("Ok. Ich beginne jetzt zu raten.");
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		System.out.println("Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");
		System.out.println("Ist es die "+zahl+" ?");
		eingabe = keyScan.nextInt();
		
		while (eingabe != 1) {
			if (eingabe == 2) {
				zahl = rn.nextInt(zahl);
				System.out.println("Ist es die "+zahl+" ?");
				eingabe = keyScan.nextInt();
			} else if (eingabe == 3) {
				zahl = rn.nextInt(zahl)+zahl;
				System.out.println("Ist es die "+zahl+" ?");
				eingabe = keyScan.nextInt();
			}
		}
		if (eingabe == 1) {
			System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
		}
		keyScan.close(); 
	}

}