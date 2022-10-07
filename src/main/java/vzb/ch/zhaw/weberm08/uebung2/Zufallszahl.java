package vzb.ch.zhaw.weberm08.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(100);
		int input = 0;
		int count = 1;
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		input = sc.nextInt();
		
		while (input != zahl){
			if(zahl > input) {
				System.out.println("Zu klein");
				input = sc.nextInt();
			} else if (zahl < input) {
				System.out.println("Zu gross");
				input = sc.nextInt();
			} 
			count++;
		}
		
		System.out.println("Richtig, du hast " + count + " Versuche benötigt.");
	}
}