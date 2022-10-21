package vzb.ch.zhaw.lowjan01.uebung4;

import ch.zhaw.lib.ZhawWavLib;

import java.util.Scanner;

public class ZusatzaufgabeRegex {

	public static void main(String[] args) {

		Scanner keyScan = new Scanner(System.in);

		System.out.print("Bitte gib deine E-Mail-Adresse ein: ");
		String mail = keyScan.nextLine();

		String invalidPW = "[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}.com";

		boolean tr = (mail.matches(invalidPW));

		while (tr == false) {
			System.out.println(mail + " ist keine gültige E-Mail-Adresse.");
			System.out.print("Bitte gib deine E-Mail-Adresse ein: ");
			mail = keyScan.nextLine();
		}
		System.out.println("Wir haben eine Nachricht an deine E-Mail-Adresse " + mail + " geschickt!");
	
		keyScan.close();

	}
}


