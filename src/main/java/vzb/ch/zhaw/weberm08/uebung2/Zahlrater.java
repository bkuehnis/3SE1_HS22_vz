package vzb.ch.zhaw.weberm08.uebung2;

import java.util.Random;
import java.util.Scanner;

public class Zahlrater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int zahlMin = 0;
		int zahlMax = 100;
		int input = 0;
		
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		sc.next();
		System.out.println("Ok. Ich beginne jetzt zu raten");
		System.out.println("Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");
		System.out.println();

		
		while (input != 1){
			int zahl = rn.nextInt(zahlMin, zahlMax);
			System.out.println("Ist es die " + zahl + "?");
			input = sc.nextInt();
			
			if (input == 2) {
				zahlMax = zahl - 1;
				System.out.println("Zu klein");
			} else if (input == 3) {
				zahlMin = zahl + 1;
				System.out.println("Zu gross");
			} 
		}
		
		System.out.println("Richtig, du hast " + " Versuche benötigt.");
	}
}
