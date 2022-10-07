package vza.ch.zhaw.campbjam.uebung2;

import java.util.Scanner;

public class ZahlenRaten2 {
	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);
		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		keyScan.nextLine();

		System.out.print(
				"Ok. Ich beginne jetzt zu raten.\nAntworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");

		int guess = 50;
		int counter = 50;
		boolean isCorrect = false;

		while (!isCorrect) {
			counter = counter / 2;
			System.out.println("\nIst es die " + guess + "?");
			int eingabe = keyScan.nextInt();

			if (eingabe == 1) {
				System.out.println(counter);
				System.out.println("Uff, das war schwierig. Spielen wir nochmal?");
				isCorrect = true;
			} else if (eingabe == 2) {
				guess -= counter++;
			} else if (eingabe == 3) {
				guess += counter++;
			}

		}
		keyScan.close();

	}
}