package vzb.ch.zhaw.delvelor.uebung2;


import java.util.Random;
import java.util.Scanner;

public class Zufallszahl {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);

		Random rn = new Random();

		int zahl = rn.nextInt(101);

		int counter = 0;

		System.out.println("Rate eine Zahl wischen 0 und 100");

		int answer = keyScan.nextInt();

		while (answer != zahl) {
			if (answer < zahl)
				System.out.println("Zu klein");
			{
				if (answer > zahl)
					System.out.println("Zu gross");

				counter++;

				answer = keyScan.nextInt();

			}
		}

		System.out.println("");
		System.out.println("Richtig");
		System.out.println("");
		System.out.println("Du hast " + counter + " Versuche gebraucht");

		keyScan.close();

	}

}
