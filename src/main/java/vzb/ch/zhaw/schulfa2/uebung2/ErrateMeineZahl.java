package vzb.ch.zhaw.schulfa2.uebung2;


import java.util.Scanner;

public class ErrateMeineZahl {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("Denke dir eine Zahl zwischen 0 und 99 und drücke dann Enter.");
		System.out.println(" ");
		System.out.println(
				"Ok. Ich beginne jetzt zu raten. Antworte mir mit 1 für richtig, 2 für kleiner und 3 für grösser.");
		System.out.println(" ");

		int ans = 0;

		int lowerBound = 0;
		int upperBound = 100;

		while (ans != 1) {

			int media = (lowerBound + upperBound) / 2;

			System.out.println("Ist es die " + media + "?");

			ans = console.nextInt();

			if (ans == 2) {
				upperBound = media;
			} else if (ans == 3) {
				lowerBound = media;
			}
		}
        
		console.close();
		System.out.println("Uff, das war schwierig. Spielen wir nochmal?");

	}

}
