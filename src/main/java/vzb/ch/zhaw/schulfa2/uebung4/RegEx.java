package vzb.ch.zhaw.schulfa2.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Scanner;

public class RegEx {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Bitte gib deine E-Mail-Adresse ein: ");
		String read = console.next();

//		String mailForm = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,5}";
		String mailForm2 = "\\w+@\\w+\\.[a-zA-Z]{2,5}";

		while (!read.matches(mailForm2)) {
			System.out.println(read + " ist keine g³ltige E-Mail-Adresse.");
			System.out.print("Bitte gib deine E-Mail-Adresse ein: ");
			read = console.next();
		}

		System.out.println("Wir haben eine Nachricht an deine E-Mail-Adresse " + read + " geschickt!");

		console.close();
	}

}
