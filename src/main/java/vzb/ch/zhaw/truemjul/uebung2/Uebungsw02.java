package vzb.ch.zhaw.truemjul.uebung2;


import java.util.Scanner;
import java.util.Random;

public class Uebungsw02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		
		int zahl = rn.nextInt(101);
	
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");

		int eingabe = sc.nextInt();

		int versuche = 1;

		while (zahl != eingabe) {
			if (zahl > eingabe) {
				System.out.println("Zu klein");
			} else
				System.out.println("Zu gross");
			
			eingabe = sc.nextInt();
			versuche++;
		}
		System.out.println("Richtig. Du hast " + versuche + " Versuche benötigt.");
		sc.close();
	}
}

		
		
	

	



